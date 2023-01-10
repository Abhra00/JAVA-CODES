import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,7,2,1,3,0,-1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0 , lastIndex);
            swap(arr, lastIndex, maxIndex);
        }
    }

    static int getMaxIndex (int[] arr, int firstIndex, int lastIndex) {
        int maxIdx = firstIndex;
        for (int i = firstIndex; i <= lastIndex; i++) {
            if (arr[maxIdx] < arr[i]) {
                maxIdx = i;
            }
        }
        return maxIdx;
    }

    static void swap (int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
