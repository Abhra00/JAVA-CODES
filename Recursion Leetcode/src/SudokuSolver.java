import java.util.Arrays;

public class SudokuSolver {

    public static void main(String[] args) {
        char[][] board= {
                {'9', '5', '7', '.', '1', '3', '.', '8', '4'},
                {'4', '8', '3', '.', '5', '7', '1', '.', '6'},
                {'.', '1', '2', '.', '4', '9', '5', '3', '7'},
                {'1', '7', '.', '3', '.', '4', '9', '.', '2'},
                {'5', '.', '4', '9', '7', '.', '3', '6', '.'},
                {'3', '.', '9', '5', '.', '8', '7', '.', '1'},
                {'8', '4', '5', '7', '9', '.', '6', '1', '3'},
                {'.', '9', '1', '.', '3', '6', '.', '7', '5'},
                {'7', '.', '6', '1', '8', '5', '4', '.', '9'}
        };
        solveSudoku(board);
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }


    static boolean solveSudoku(char[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyLeft = true;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == '.') {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            if(!emptyLeft) {
                break;
            }
        }

        if(emptyLeft) {
            return true;
        }

        for(char number = '1'; number <= '9'; number++) {
            if(isValid(board, row, col, number)) {
                board[row][col] = number;
                if(solveSudoku(board)) {
                    return true;
                } else {
                    board[row][col] = '.';
                }
            }
        }
        return false;
    }
    static boolean isValid(char[][] nums, int row, int col, char num) {
//        Check the row
        for(int i = 0; i < nums.length; i++) {
            if(nums[i][col] == num) {
                return false;
            }
        }

//        Check the column
        for(int i = 0; i < nums[0].length; i++) {
            if(nums[row][i] == num) {
                return false;
            }
        }

        int sqrt = (int) (Math.sqrt(nums.length));

        int rStart = row - (row % sqrt);
        int cEnd = col - (col % sqrt);
        for(int r = rStart; r < rStart + sqrt; r++) {
            for(int c = cEnd; c < cEnd + sqrt; c++) {
                if(nums[r][c] == num) {
                    return false;
                }
            }
        }

        return true;
    }
}
