public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1,2,3};
        //System.out.println(arr[findPivotWithDuplicates(arr)]);
        System.out.println(arr[pivot(arr)]);
        // after finding pivot do normal binary search
    }

    static int pivot (int[] arr) {
        int st  = 0;
        int end = arr.length - 1;
        while(st <= end) {
            int mid = st + (end - st) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > st && arr[mid - 1] > arr[mid] ) {
                return mid - 1;
            }
            if (arr[mid] <= arr[st]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return -1;
    }

    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
