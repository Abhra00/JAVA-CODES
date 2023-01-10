public class peakIndexMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
        System.out.println(Search(arr));
    }
    static int Search(int[] arr) {
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
        return arr[start];
    }
}
