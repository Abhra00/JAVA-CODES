import java.util.Arrays;

public class AllPaths {

    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        pathFind("", maze, 0, 0);
    }

    static void pathFind(String p, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if(!maze[row][col]) {
            return;
        }
        maze[row][col] = false;
        if (row < maze.length - 1) {
            pathFind(p + 'D', maze, row + 1, col);
        }
        if (col < maze[0].length - 1) {
            pathFind(p + 'R', maze, row, col + 1);
        }

        if (row > 0) {
            pathFind(p + 'U', maze, row - 1, col);
        }
        if (col > 0) {
            pathFind(p + 'L', maze, row, col - 1);
        }
        maze[row][col] = true;
    }
}


