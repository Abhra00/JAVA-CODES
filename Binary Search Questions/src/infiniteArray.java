public class infiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr , target));
    }

    static int ans (int[] arr, int target ) {
        int start = 0;
        int end  = 1;
        while(target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        int ans  = binarySearchFunc(arr, target, start , end);

        return ans;
    }

    static int binarySearchFunc(int[] arr, int key, int start , int end) {
        while(start <= end) {
//            int mid = (start + end) / 2; // may be this can go out of integer range
//            Optimised way to find mid
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
