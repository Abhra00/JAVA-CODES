public class SplitTwoStrings {
    public static void main(String[] args) {
        String a = "x";
        String b = "y";
        System.out.println(checkPalindromeFormation(a, b));
    }

    static  boolean checkPalindromeFormation(String a, String b) {
        return check(a, b) || check(b, a);
    }
    
    static boolean check(String a, String b) {
        int lo = 0;
        int hi = b.length() - 1;
        while(lo < hi &&  a.charAt(lo) == b.charAt(hi)) {
            lo++;
            hi--;
        }

        if(lo >= hi) {
            return true;
        }

        return isPalindrome(a.substring(lo, hi +1)) || isPalindrome(b.substring(lo, hi + 1));
    }

    static boolean isPalindrome(String str) {
        int lo = 0;
        int hi = str.length() - 1;
        while(lo < hi && str.charAt(lo) == str.charAt(hi)) {
            lo++;
            hi--;
        }

        return lo >= hi;
    }
}
