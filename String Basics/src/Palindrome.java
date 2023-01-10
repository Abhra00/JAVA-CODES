public class Palindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome (String str) {
        str = str.toLowerCase();
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (!Character.isLetterOrDigit(str.charAt(start))) start++;
            else if (!Character.isLetterOrDigit(str.charAt(end))) end--;
            else if (str.charAt(start) != str.charAt(end)) return false;
            else {
                start++;
                end--;
            }
        }
        return true;
    }
}
