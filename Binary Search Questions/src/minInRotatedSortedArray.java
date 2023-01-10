public class minInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(findMin(arr));
    }
    static int findMin(int[] nums) {
        int st = 0;
        int end = nums.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if(nums[mid] > nums[st]) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return nums[st];
    }
}

