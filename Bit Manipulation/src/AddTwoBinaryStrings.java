public class AddTwoBinaryStrings {
    public static void main(String[] args) {
        String a = "1";
        String b = "11";
        System.out.println(addBinary(a, b));
    }

    static String addBinary(String a, String b) {
        int sum = 0;
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder ans = new StringBuilder();
        while(i >= 0 && j >= 0) {
            int val1 = a.charAt(i) - '0';
            int val2 = b.charAt(j) - '0';
            sum = val1 + val2 + carry;
            if(sum == 2) {
                carry = 1;
                ans.append('0');
            } else if(sum == 3) {
                ans.append('1');
                carry = 1;
            } else if(sum == 0 || sum == 1) {
                ans.append((char) (sum + '0'));
                carry = 0;
            }
            i--;
            j--;
        }

        while(i >= 0) {
            sum = (a.charAt(i) - '0') + carry;
            if(sum == 2) {
                carry = 1;
                ans.append('0');
            } else if(sum == 3) {
                ans.append('1');
                carry = 1;
            }
            else if(sum == 0 || sum == 1){
                ans.append((char) (sum + '0'));
                carry = 0;
            }
            i--;
        }
        while(j >= 0) {
            sum = (b.charAt(j) - '0') + carry;
            if(sum == 2) {
                carry = 1;
                ans.append('0');
            } else if(sum == 3) {
                ans.append('1');
                carry = 1;
            } else if(sum == 0 || sum == 1) {
                ans.append((char) (sum + '0'));
                carry = 0;
            }
            j--;
        }
        if(carry != 0) {
            ans.append((char)(carry + '0'));
        }
        ans.reverse();
        return ans.toString();
    }
}
