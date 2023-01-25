public class RotatedBinarySearchRecursive {

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3, 4};
        int start = 0;
        int end = arr.length - 1;
        int target = 4;
        System.out.println(binarySearch(arr, target, start, end));
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        if(start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(target == arr[mid]) {
            return mid;
        }
        if(arr[start] <= arr[mid]) {
            if(target >= arr[start] && target <= arr[mid]) {
                return binarySearch(arr, target, start, mid - 1);
            } else {
                return binarySearch(arr, target, mid + 1, end);
            }
        }

        if(target >= arr[mid] && target <= arr[end]) {
            return binarySearch(arr, target, mid + 1, end);
        } else {
            return binarySearch(arr, target, start, mid - 1);
        }
    }
}
