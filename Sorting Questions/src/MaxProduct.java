
import java.util.Scanner;

public class MaxProduct {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int prod = maximumProduct(arr);
        System.out.println(prod);
        scn.close();
    }
    static int maximumProduct(int[] arr) {
        // Max Check
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for(int val : arr) {
            if(val >= max1) {
                max3 = max2;
                max2 = max1;
                max1 = val;
            } else if (val >= max2) {
                max3 = max2;
                max2 = val;
            } else if(val >= max3) {
                max3 = val;
            }
        }

        // Min check
        int min1 = Integer.MAX_VALUE;
        int min2 = min1;
        for(int val : arr) {
            if(val <= min1) {
                min2 = min1;
                min1 = val;
            } else if (val <= min2) {
                min2 = val;
            }
        }

        return Math.max((max1 * max2 * max3), (max1 * min1 * min2));

    }
    
}
