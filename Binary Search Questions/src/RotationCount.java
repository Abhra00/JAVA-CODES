public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1,2,3};
        System.out.println("The rotation count is:-> " + (findPivot(arr)+ 1));
    }

    static int findPivot (int[] arr) {
        int st = 0 ;
        int end = arr.length - 1;
        while(st <= end) {
            int mid = st + (end - st) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if(mid > st && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if(arr[mid] <= arr[st]) {
                end = mid -1;
            } else {
                st = mid + 1;
            }
        }
        return -1;
    }
}
