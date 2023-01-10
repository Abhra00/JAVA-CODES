import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr, 9)));
    }

    static int[] twoSum (int[] arr,int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            int rem = target - arr[i];
            if(map.containsKey(rem)) {
                int index = map.get(rem);
                if(index == i) {
                    continue;
                }
                return new int[] {i,index};
            }
        }
        return new int[] {};
    }
}
