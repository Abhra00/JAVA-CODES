public class AlikeString {
    public static void main(String[] args) {
        String S = "Uo";
        System.out.println(halvesAreAlike(S));
    }

    static boolean halvesAreAlike(String s) {
        String T = s.toLowerCase();
        int n = s.length();
        int start = 0;
        int end = n - 1;
        int count1 = 0;
        int count2 = 0;
        while(start < end) {
            if(T.charAt(start) == 'a'||T.charAt(start) == 'e' ||T.charAt(start) == 'i'|| T.charAt(start) == 'o'|| T.charAt(start) == 'u') {
                count1++;
            }
            if(T.charAt(end) == 'a'||T.charAt(end) == 'e' ||T.charAt(end) == 'i'|| T.charAt(end) == 'o'|| T.charAt(end) == 'u') {
                count2++;
            }
            start++;
            end--;
        }
        if(count1 == count2) {
            return true;
        }
        return false;
    }
}
