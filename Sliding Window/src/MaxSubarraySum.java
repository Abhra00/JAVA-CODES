import java.util.Scanner;

public class MaxSubarraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();

        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        input.close();
        
        System.out.printf("Max sum subarray of size %d = %d%n", k, findSumMaxSubarrayOfSizeK(a, k));
    }

    static int findSumMaxSubarrayOfSizeK(int[] a, int k) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        while(j < a.length) {
            sum += a[j];
            if(j - i + 1 < k) {
                j++;
            } else if(j - i + 1 == k) {
                max = Math.max(sum, max);
                sum -= a[i];
                i++;
                j++;
            }
        }
        return max;
    }
}
