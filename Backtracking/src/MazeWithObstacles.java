public class MazeWithObstacles {

    public static void main(String[] args) {
        boolean[][] maze = new boolean[3][3];
        maze[1][1] = true;
        pathFind("", maze, 0,0);
    }

    static void pathFind(String p, boolean[][] maze, int row, int col) {
        if(row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if(maze[row][col] == true) {
            return;
        }
        if(row < maze.length - 1) {
            pathFind(p + 'D', maze, row + 1, col);
        }
        if(col < maze[0].length - 1) {
            pathFind(p + 'R', maze, row , col + 1);
        }
    }
}
