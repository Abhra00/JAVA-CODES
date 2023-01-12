public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 55, 66, 78};
        int target = 66;
        int start = 0;
        int end = arr.length - 1;
        System.out.println(search(arr, target, start, end));
    }
    static int search(int[] arr, int target, int start, int end) {
        if(start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == target) {
            return mid;
        }
        if(target > arr[mid]) {
            return search(arr, target, mid + 1, end);
        }

        return search(arr, target, start, mid - 1);
    }
}

