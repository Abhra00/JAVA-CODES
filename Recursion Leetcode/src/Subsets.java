import java.util.ArrayList;

public class Subsets {

    public static void main(String[] args) {
        System.out.println(generateSubsets("", "ABC"));
    }

    static ArrayList<String> generateSubsets(String p, String up) {
        ArrayList<String> ans = new ArrayList<>();
        helper(p, up, ans);
        return ans;
    }

    static void helper(String p, String up, ArrayList<String> ans) {
        if(up.isEmpty()) {
            ans.add(p);
            return;
        }

        char ch = up.charAt(0);
        helper(p + ch, up.substring(1), ans);
        helper(p, up.substring(1), ans);
    }
}
