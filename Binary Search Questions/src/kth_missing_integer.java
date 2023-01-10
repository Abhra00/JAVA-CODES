public class kth_missing_integer {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        System.out.println(missingInteger(arr, 5));
    }
    static int missingInteger(int[]  arr, int k) {
        int st = 0;
        int end = arr.length;
        while(st < end) {
            int mid = st + (end - st) / 2;
            int missingCount = arr[mid] - (mid+1);
            if(missingCount >= k) {
                end = mid;
            } else {
                st = mid + 1;
            }
        }
        return st + k;
    }
    
}
