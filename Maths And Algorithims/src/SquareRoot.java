public class SquareRoot {
    public static void main(String[] args) {
        int n = 36;
        System.out.println(sqrt(n));
    }

    static int sqrt(int n) {
        if(n == 0) {
            return 0;
        }
        int start = 0;
        int end = n;
        int ans = -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if((mid * mid) <= n) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
