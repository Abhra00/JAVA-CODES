import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {
        int[] nums = {2,3,6,7};
        for(List<Integer> ans : combinationSum(nums, 7)) {
            System.out.println(ans.toString());
        }
    }

    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }
    static void findCombination(int index, int[] nums, int target, List<List<Integer>> ans, ArrayList<Integer> ds) {
        if(index == nums.length) {
            if(target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if(nums[index] <= target) {
            ds.add(nums[index]);
            findCombination(index, nums,target - nums[index], ans, ds);
            ds.remove(ds.size() - 1);
        }
        findCombination(index + 1, nums,target, ans, ds);
    }
}
