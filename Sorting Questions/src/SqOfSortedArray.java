import java.util.*;

public class SqOfSortedArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums = new int[n];
        
        for(int i = 0; i < n; i++) 
            nums[i] = scn.nextInt();
        
        int[] res = sortedSquares(nums);

        for(int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
        scn.close();
    }

    // ~~~~~~~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~~~~~~~

    public static int[] sortedSquares(int[] nums) {
        // write your code here
        int[] ans = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;
        int idx = ans.length - 1;
        while(start <= end && idx >= 0) {
            if(Math.abs(nums[start]) >= Math.abs(nums[end])) {
                ans[idx] = nums[start] * nums[start];
                start++;
            } else {
                ans[idx] = nums[end] * nums[end];
                end--;
            }
            idx--; 
        }
        return ans;
    }
}
