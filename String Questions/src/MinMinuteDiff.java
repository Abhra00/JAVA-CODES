import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinMinuteDiff {
    public static void main(String[] args) {
        List<String> timepoints = new ArrayList<String>(Arrays.asList("00:00","23:59","00:00"));
            
        System.out.println(findMinDifference(timepoints));
    }

    static int findMinDifference(List<String> timepoints) {
        int n = timepoints.size();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            String cTime = timepoints.get(i);
            int minute = (Integer.parseInt(cTime.substring(0, 2)) * 60) + Integer.parseInt(cTime.substring(3));
            arr[i] = minute;
        }

        int ans = (int) 1e9;
        Arrays.sort(arr);
        for(int i = 1; i < n; i++) {
            ans = Math.min(ans, arr[i] - arr[i - 1]);
        }
        ans = Math.min(ans, (24*60 - arr[n - 1]) + arr[0]);
        return ans;
    }
    
}
