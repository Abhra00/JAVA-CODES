public class MinLengthString {
    public static void main(String[] args) {
        String s = "cabaabac";
        System.out.println(minimumLength(s));
    }

    static int minimumLength(String s) {
        int lo = 0;
        int hi = s.length() - 1;
        while(lo < hi && s.charAt(lo) == s.charAt(hi)) {
            char ch = s.charAt(lo);
            while(lo < hi && ch == s.charAt(lo)) {
                lo++;
            }
            while(lo <= hi && ch == s.charAt(hi)) {
                hi--;
            }
        }

        return (hi - lo) + 1;
    }
    
}
