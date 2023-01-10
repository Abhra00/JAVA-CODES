import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int[] stalls = {4, 2, 1, 3, 6};
        System.out.println("The maximum minimum distance is :-> " + aggressiveCows(stalls.length, 2, stalls) );
    }

    static int aggressiveCows (int n, int k, int[] stalls) {
        Arrays.sort(stalls);
        int start = 0;
        int end = stalls[stalls.length - 1] - stalls[0];
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(isPossible(stalls, mid, k)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

   static boolean isPossible (int[] stalls, int mid, int cows) {
        int cowsCount = 1;
        int lastPos = stalls[0];
        for(int i = 0; i < stalls.length; i++) {
            if (stalls[i] - lastPos >= mid) {
                cowsCount++;
                if (cowsCount == cows) {
                    return true;
                }
                lastPos = stalls[i];
            }
        }
        return false;
    }
}
