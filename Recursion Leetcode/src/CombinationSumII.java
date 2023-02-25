import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public static void main(String[] args) {
        int[] arr = {10,1,2,7,6,1,5};
        int target = 8;
        for(List<Integer> list : combinationSum2(arr, target)) {
            System.out.println(list);
        }
    }

    static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombination(0, candidates, target, ans, new ArrayList<>());
        return ans;

    }

    static void findCombination(int index, int[] nums, int target, List<List<Integer>> ans, ArrayList<Integer> ds) {
        if(target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i = index; i < nums.length; i++) {
            if(i > index && nums[i] == nums[i - 1]) {
                continue;
            }
            if(nums[i] > target) {
                break;
            }

            ds.add(nums[i]);
            findCombination(i + 1, nums, target - nums[i], ans, ds);
            ds.remove(ds.size() - 1);
        }
    }
}
