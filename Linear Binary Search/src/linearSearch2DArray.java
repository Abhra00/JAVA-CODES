import java.util.Arrays;
import java.util.Scanner;

public class linearSearch2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = {
                {12, 34, 45, 67,},
                {23, 56, 99, 105},
                {101, 102, 103, 104},
        };
        System.out.println("Enter the you want to search:");
        int key = input.nextInt();
        int[] ans = searchArray2D(arr, key);
        System.out.println(Arrays.toString(ans));
        System.out.println("Your maximum element in the array is : " + maxInArray2D(arr));
        input.close();
    }
    static int[] searchArray2D(int[][] arr, int key) {
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == key) {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int maxInArray2D(int[][] arr) {
        int  max = Integer.MIN_VALUE;
        for (int[] rows : arr) {
            for (int element : rows) {
                if (element > max) {
                    max = element;
                }
            }
        }
            return max;
        }
    }
