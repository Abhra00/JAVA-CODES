import java.util.ArrayList;

public class RatInMaze {
    public static void main(String[] args) {
        int[][] m = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };

        System.out.println(findPath(m, m.length));
    }


    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> ans = new ArrayList<>();
        findPathHelper(m, "", 0, 0, ans);
        return ans;
    }

    static void findPathHelper(int[][] m, String p, int row, int col, ArrayList<String> ans) {
        if(row == m.length - 1 && col == m[0].length - 1) {
            ans.add(p);
            return;
        }

        if(m[row][col] == 0) {
            return;
        }
        m[row][col] = 0;
        if(row < m.length - 1) {
            findPathHelper(m, p + 'D', row + 1, col, ans);
        }
        if(col < m[0].length - 1) {
            findPathHelper(m, p + 'R', row, col + 1, ans);
        }
        if(row > 0) {
            findPathHelper(m, p + 'U', row - 1, col, ans);
        }
        if(col > 0) {
            findPathHelper(m, p + 'L', row, col - 1, ans);
        }
        m[row][col] = 1;
    }
}
