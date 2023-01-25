import java.util.ArrayList;

public class FindAllIndex {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5};
        ArrayList<Integer> ans = new ArrayList<>();

        System.out.println(findAllIndexWithoutArgument(arr, 4, 0));
    }
    static ArrayList<Integer> findAllIndex (int[] arr, int target, int index, ArrayList<Integer> ans) {
        if(index == arr.length) {
            return ans;
        }
        if(arr[index] == target) {
            ans.add(index);
        }

        return findAllIndex(arr, target, index + 1, ans);
    }
    static ArrayList<Integer> findAllIndexWithoutArgument (int[] arr, int target, int index) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(index == arr.length) {
            return ans;
        }
        if(arr[index] == target) {
            ans.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = findAllIndexWithoutArgument(arr, target, index + 1);
        ans.addAll(ansFromBelowCalls);
        return ans;
    }
}
