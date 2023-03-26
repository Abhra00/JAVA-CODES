package Contest1;

import java.util.ArrayList;

public class ValuableString {
    public static void main(String[] args) {
        String[] arr={"house","car","tree"};
        System.out.println(valuableString(arr, arr.length));
    }
    static String valuableString(String[] arr, int n){
        int maxVal = Integer.MIN_VALUE;
        String ans = "";
        for (String str : arr) {
            int val = 0;
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    val = val - 1;
                } else {
                    val = val + 1;
                }
            }
            val = Math.abs(val);
            if(val > maxVal) {
                maxVal = val;
                ans = str;
            }
        }

        return ans;
    }
}
