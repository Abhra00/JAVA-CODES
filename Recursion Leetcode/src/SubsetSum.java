import java.util.ArrayList;
import java.util.Collections;

public class SubsetSum {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        System.out.println(subsetSum(arr));
    }

    static ArrayList<Integer> subsetSum(int[] arr)  {
        ArrayList<Integer> ans = new ArrayList<>();
        subsetSumHelper(arr, 0, 0, ans);
        Collections.sort(ans);

        return ans;
    }

    static void subsetSumHelper(int[] arr, int index, int sum, ArrayList<Integer> ans) {
        if(index == arr.length) {
            ans.add(sum);
            return;
        }

        subsetSumHelper(arr, index + 1, sum + arr[index], ans);
        subsetSumHelper(arr, index + 1, sum, ans);
    }
}
