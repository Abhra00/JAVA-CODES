//https://leetcode.com/problems/set-mismatch/

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    static int[] findErrorNums (int[] nums) {
        cyclicSort(nums);
        int[] ans = {-1,-1};
        for(int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1) {
                ans[0] = nums[index];
                ans[1] = index + 1;
            }
        }
        return ans;
    }

    static void cyclicSort (int[] arr) {
        int  start = 0;
        while (start < arr.length) {
            int correctIndex = arr[start] - 1;
            if (arr[start] != arr[correctIndex]) {
                swap (arr, start, correctIndex);
            } else {
                start++;
            }
        }
    }

    static void swap (int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
