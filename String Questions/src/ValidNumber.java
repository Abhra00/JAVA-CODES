public class ValidNumber {
    public static void main(String[] args) {
        String num = "3.";
        System.out.println(isNumber(num));
    }

    static boolean isNumber(String s) {
        boolean digit_seen = false;
        boolean e_seen = false;
        boolean dot_seen = false;
        int sign_count = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)) {
                digit_seen = true;
            } else if (ch == '+' || ch == '-') {
                if(sign_count == 2) {
                    return false;
                }
                if(i > 0 && (s.charAt(i - 1) != 'E' && s.charAt(i - 1) != 'e')) {
                    return false;
                }
                if(i == s.length() - 1) {
                    return false;
                }
                sign_count++;
            } else if (ch == '.') {
                if(dot_seen || e_seen) {
                    return false;
                }
                if(i == s.length() - 1 && !digit_seen) {
                    return false;
                }
                dot_seen = true;
            } else if(ch == 'e' || ch == 'E') {
                if(e_seen || !digit_seen || i == s.length() - 1) {
                    return false;
                }
                e_seen = true;
            } else {
                return false;
            }
        }
        return true;
    }
}
