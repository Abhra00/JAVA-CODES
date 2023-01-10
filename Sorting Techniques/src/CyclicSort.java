import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,4,6,2,1};
        cyclicSort (arr);
        System.out.println(Arrays.toString(arr));
    }
// DO THIS WHEN NUMBERS ARE IN RANGE IN OF 1 TO N- 1
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
