public class SudokuSolver {

    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if (solve(board)) {
            display(board);
        } else {
            System.out.println("Cannot solve");
        }
    }

    static boolean solve(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyLeft = true;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            if(emptyLeft == false) {
                break;
            }
        }

        if(emptyLeft == true) {
            return true;
        }

        for(int number = 1; number <= 9; number++) {
            if(isValid(board, row, col, number)) {
                board[row][col] = number;
                if(solve(board)) {
                    return true;
                } else {
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }
    static boolean isValid(int[][] nums, int row, int col, int num) {
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
    static void display(int[][] board) {
        for(int[] row : board) {
            for(int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
