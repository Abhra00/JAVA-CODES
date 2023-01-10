import java.util.Arrays;

class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] nums) {
       int ans = cyclicSort(nums);
       return ans;
    }
    static int cyclicSort (int[] arr) {
        int  start = 0;
        while (start < arr.length) {
            int correctIndex = arr[start];
            if (arr[start] < arr.length && arr[start] != arr[correctIndex]) {
                swap (arr, start, correctIndex);
            } else {
                start++;
            }
        }
        //Search for the element
        for(int index = 0; index < arr.length; index++) {
            if(arr[index] != index) {
                return index;
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