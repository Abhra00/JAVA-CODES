public class MultiplyString {
    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";
        String ans = multiplyString(num1, num2);
        System.out.println(ans);
    }

    static String multiplyString(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int i = num2.length() - 1;
        int pf = 0;
        int[] res = new int[num2.length() + num1.length()];
        while(i >= 0) {
            int ival = num2.charAt(i) - '0';
            i--;
            int k = res.length - 1 - pf;
            int j = num1.length() - 1;
            int carry = 0;
            while(j >= 0 || carry != 0) {
                int jval = j >= 0 ? num1.charAt(j) - '0' : 0;
                j--;
                int prod = (ival * jval) + carry + res[k];
                res[k] = prod % 10;
                carry = prod / 10;
                k--;
            }
            pf++;
        }
        String  str = "";
        boolean flag = false;
        for(int j = 0; j < res.length; j++) {
            if(res[j] == 0 && flag == false) {
                continue;
            } else {
                flag = true;
                str += res[j];
            }
        }
        return str;
    }
    
}
