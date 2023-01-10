import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
    static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        cyclicSort(nums);
        for(int i = 0; i < nums.length; i++) {
            if((nums[i] - 1) != i) {
                ans.add(i + 1);
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