import java.util.ArrayList;
import java.util.List;

public class CamelCaseMatching {
    public static void main(String[] args) {
        String[] queries = {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
        String pattern = "FB";
        System.out.println(camelMatch(queries, pattern).toString());
    }

    static List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans = new ArrayList<Boolean>();
        for(int i = 0; i < queries.length; i++) {
            if(check(queries[i],pattern)) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }
    static boolean check(String word, String pattern) {
        int idx = 0;
        int capCount = 0;
        for(int i = 0; i < word.length(); i++) {
            char wCh = word.charAt(i);
            if(idx < pattern.length() && wCh == pattern.charAt(idx)) {
                idx++;
            } else if(Character.isUpperCase(wCh)) {
                capCount++;
            }
        }

        return (idx == pattern.length() && capCount == 0);
    }
    
}
