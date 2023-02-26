import java.util.ArrayList;
import java.util.List;

public class KthPermutation {

    public static void main(String[] args) {
        int n = 4;
        int k = 16;
        System.out.println(getPermutation(n, k));
    }


    static String getPermutation(int n, int k) {
        int fact = 1;
        List<Integer> nums = new ArrayList<>();
        for(int i = 1; i < n; i++) {
            fact *= i;
            nums.add(i);
        }

        nums.add(n);
        k -= 1;
        String ans = "";
        while(true) {
            ans += nums.get(k / fact);
            nums.remove(k / fact);
            if(nums.size() == 0) {
                break;
            }
            k = k % fact;
            fact = fact / nums.size();
        }

        return ans;
    }
}
