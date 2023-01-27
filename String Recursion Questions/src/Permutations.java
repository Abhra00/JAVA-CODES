import java.util.ArrayList;

public class Permutations {

    public static void main(String[] args) {
        System.out.println(permutationCount("", "abc"));
       for(String ans : permutationList("", "abc")) {
           System.out.println(ans);
       }
    }

    static void permutationPrint(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        int len = p.length();
        for(int i = 0; i <= len; i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, len);
            String ans = first + ch + second;
            permutationPrint(ans, up.substring(1));
        }
    }

    static int permutationCount(String p, String up) {
        if(up.isEmpty()) {
            return 1;
        }

        int count = 0;
        char ch = up.charAt(0);
        int len = p.length();
        for(int i = 0; i <= len; i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, len);
            String ans = first + ch + second;
            count += permutationCount(ans, up.substring(1));
        }
        return count;
    }
    static ArrayList<String> permutationList(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> res = new ArrayList<>();
        char ch = up.charAt(0);
        int len = p.length();
        for(int i = 0; i <= len; i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, len);
            String ans = first + ch + second;
            res.addAll(permutationList(ans, up.substring(1)));
        }
        return res;
    }
}
