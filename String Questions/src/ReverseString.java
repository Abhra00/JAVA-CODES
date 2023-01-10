public class ReverseString {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    static String reverseWords(String s) {
        String[] s1 = s.split(" ");
        StringBuffer ans = new StringBuffer();
        for(String x : s1) {
            StringBuffer temp = new StringBuffer(x);
            ans.append(temp.reverse());
            ans.append(" ");
        }
        ans.setLength(ans.length() - 1);
        return ans.toString();
    }
    
}
