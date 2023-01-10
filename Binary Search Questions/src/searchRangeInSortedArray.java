import java.util.Arrays;

public class searchRangeInSortedArray {
    public static void main(String[] args) {
        int[] nums = {};
        int target = 0;
        int[] ans = searchRange(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = search(nums , target , true);
        if (ans[0] != -1) {
            ans[1] = search(nums , target , false);
        }
        return ans;
    }

    static int search(int[] nums , int target, boolean FirstOccurance) {
        int ans = -1 ;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
//            int mid = (start + end) / 2; // may be this can go out of integer range
//            Optimised way to find mid
            int mid = start + (end - start) / 2;

            if (nums[mid] < target) {

                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                // maybe potential answer is found
                ans = mid;
                if(FirstOccurance) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    }



