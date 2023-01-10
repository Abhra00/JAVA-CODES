import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {1,2,0};
        System.out.println("The smallest positive integer is :-> " + findMissingPositive(arr));
    }

    static int findMissingPositive (int[] nums) {
        int  start = 0;
        while (start < nums.length) {
            int correctIndex = nums[start] - 1;
            if (nums[start] < nums.length && nums[start] > 0 && nums[start] != nums[correctIndex]) {
                swap(nums, start, correctIndex);
            } else {
                start++;
            }
        }
        //Search for the element
        for(int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1) {
                return index + 1;
            }
        }
        return -1;
    }

    static void swap (int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
