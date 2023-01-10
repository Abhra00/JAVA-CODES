public class bookAllocation {
    public static void main(String[] args) {
        int[] pages = {12,34,67,90};
        int students = 2;
        System.out.println(findPages(pages, 4, students));
    }

    static int findPages (int[]A,int N,int M) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < A.length; i++) {
            end += A[i];
        }
        int ans = 0;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if(isPossible(A, mid, M)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    static boolean isPossible (int[] arr, int minPages, int M) {
        int studentCount = 1;
        int pageSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > minPages) {
                return false;
            }
            if (pageSum + arr[i] > minPages) {
                studentCount++;
                pageSum = arr[i];
                if (studentCount > M) {
                    return false;
                }
            } else {
                pageSum += arr[i];
            }
        }
        return true;
    }
}