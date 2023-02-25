import java.util.ArrayList;

public class NDigitNumber {
    public static void main(String[] args) {
        int N = 2;
        System.out.println(increasingNumber(N));
    }

    static void increasingNumberRec(int last, int n, int num, ArrayList<Integer> ans) {
        if(n == 0) {
            ans.add(num);
            return;
        }

        for(int i = last; i <= 9; i++) {
            int a = 10 * num + i;

            increasingNumberRec(i + 1, n - 1, a, ans);
        }
    }

    static ArrayList<Integer> increasingNumber(int N) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(N == 1) {
            for(int i = 1; i <= 9; i++) {
                ans.add(i);
            }
            return ans;
        }
        increasingNumberRec(1, N, 0, ans);
        return ans;
    }
}
