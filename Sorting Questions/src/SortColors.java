import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums)); 
    }

    static void sortColors(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;
        int mid = 0;
        while (mid <= hi) {
            switch (nums[mid]) {
                case 0:
                    swap(nums, lo, mid);
                    lo++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums, hi, mid);
                    hi--;
                    break;
            }
        }
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
