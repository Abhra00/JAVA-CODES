import java.util.ArrayList;
import java.util.List;

public class Maze {

    public static void main(String[] args) {
        System.out.println(pathCount(3,3));
        System.out.println(pathPattern("", 3, 3));
    }

    static int pathCount(int row, int col) {
        if(row == 1 || col == 1) {
            return 1;
        }

        int count = 0;
        count += pathCount(row - 1, col);
        count += pathCount(row, col -1);
        return count;
    }

    static List<String> pathPattern(String p, int row, int col) {
        if(row == 1 && col == 1) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> list = new ArrayList<>();
        if(row > 1) {
            list.addAll(pathPattern(p + "D", row - 1, col));
        }
        if(col > 1) {
            list.addAll(pathPattern(p + "R", row, col - 1));
        }
        // For Diagonal Paths
        if(row > 1 && col > 1) {
            list.addAll(pathPattern(p + "C", row - 1, col - 1));
        }
        return list;
    }
}
