public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,2,1};
        int target = 3;
        System.out.println(search(arr , target));
    }

    static  int search (int[] arr, int target) {
        int peak = peakElement(arr);
        int FirstTry = orderAgnosticBinarySearch(arr , target, 0 , peak);
        if (FirstTry != -1) {
            return FirstTry;
        }

        return orderAgnosticBinarySearch(arr , target , peak+1, arr.length-1);
    }

    static int peakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
//            int mid = (start + end) / 2; // may be this can go out of integer range
//            Optimised way to find mid
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                end = mid;
            }  else {
                start = mid + 1;
            }
        }
        return start;
    }
    static int orderAgnosticBinarySearch(int[] arr, int key , int start, int end) {
        boolean isAscending = arr[start] < arr[end];
        while(start <= end) {
//            int mid = (start + end) / 2; // may be this can go out of integer range
//            Optimised way to find mid
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (isAscending) {
                if (arr[mid] > key) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] > key) {
                    start = mid + 1;
                } else {
                    end = mid -1;
                }
            }
        }
        return -1;
    }
}
