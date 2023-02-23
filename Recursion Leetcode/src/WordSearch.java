public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };

        String word = "ABCCED";
        System.out.println(exist(board, word));
    }

    static boolean exist(char[][] board, String word) {
        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[0].length; col++) {
                if((board[row][col] == word.charAt(0)) && helper(board, row, col, word, 0)){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean helper(char[][] board, int row, int col, String word, int count) {
        if(count == word.length()) {
            return true;
        }

        if(row == -1 || row == board.length || col == -1 || col == board[0].length || board[row][col] != word.charAt(count)) {
            return false;
        }
        char temp = board[row][col];
        board[row][col] = '*';
        boolean found = helper(board, row + 1, col, word, count + 1) ||
                helper(board, row - 1, col, word, count + 1) ||
                helper(board, row, col + 1, word, count + 1) ||
                helper(board, row, col - 1, word, count + 1);

        board[row][col] = temp;
        return found;
    }
}
