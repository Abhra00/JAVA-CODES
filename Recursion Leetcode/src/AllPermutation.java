import java.util.ArrayList;
import java.util.List;
import java.util.ListResourceBundle;

public class AllPermutation {

    public static void main(String[] args) {
        int[] arr = {1, 2,3};
        for(List<Integer> lst : permute(arr)) {
            System.out.println(lst);
        }
    }

    static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        permuteHelper(nums, freq, ans, new ArrayList<>());
        return ans;
    }

    static void permuteHelper(int[] nums, boolean[] freq, List<List<Integer>> ans, List<Integer> ds) {
        if(ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            if(!freq[i]) {
                freq[i] = true;
                ds.add(nums[i]);
                permuteHelper(nums, freq, ans, ds);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }
}
