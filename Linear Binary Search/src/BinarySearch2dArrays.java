import java.util.Arrays;

public class BinarySearch2dArrays {
    public static void main(String[] args) {
        int[][] matrix = {
                {10,20,30,40},
                {28,31,35,45},
                {34,41,47,50}
        };
        int target = 35;
        System.out.println(Arrays.toString(binarySearch(matrix,target)));
    }

    static int[] binarySearch (int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;
        while (row < matrix.length && col >= 0) {
            if(matrix[row][col] == target) {
                return new int[]{row,col};
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return new int []{-1,-1};
    }
}
