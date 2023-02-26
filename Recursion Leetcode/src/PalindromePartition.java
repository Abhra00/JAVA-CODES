import java.util.ArrayList;
import java.util.List;

public class PalindromePartition {

    public static void main(String[] args) {
        String s = "aab";
        for(List<String> lst : partition(s)) {
            System.out.println(lst);
        }
    }

    static List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        partitionHelper(0, s, new ArrayList<>(), ans);
        return ans;
    }

    static void partitionHelper(int index, String s, List<String> path, List<List<String>> ans) {
        if(index == s.length()) {
            ans.add(new ArrayList<>(path));
            return;
        }

        for(int i = index; i < s.length(); i++) {
            if(isPalindrome(s, index, i)) {
                path.add(s.substring(index, i + 1));
                partitionHelper(i + 1, s, path, ans);
                path.remove(path.size() - 1);
            }
        }
    }

    static boolean isPalindrome(String s, int start, int end) {
        while(start <= end) {
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
