import java.util.ArrayList;
import java.util.List;

public class VerticalPrinting {
    public static void main(String[] args) {
        String s = "HOW ARE YOU";
        System.out.println(printVertically(s).toString());
    }

    static List<String> printVertically(String s) {
        List<String> res = new ArrayList<>();
        String[] sWords = s.split( " ");
        int maxWordLen = getMax(sWords);
        for(int i = 0;  i < maxWordLen; i++) {
            StringBuilder ans = new StringBuilder();
            for (String words : sWords) {
                if(i >= words.length()) {
                    ans.append(" ");
                } else {
                    ans.append(words.charAt(i));
                }
            }
            String trimmedWord = trimRight(ans.toString());
            res.add(trimmedWord);
        }
        return res;
    }

    static int getMax(String[] words) {
        int maxLen = 0;
        for(int i = 0; i < words.length; i++) {
            maxLen = Math.max(words[i].length(), maxLen);
        }
        return maxLen;
    }
    static String trimRight(String word) {
        int hi = word.length() - 1;
        while(hi >= 0) {
            if(word.charAt(hi) != ' ') {
                break;
            }
            hi--;
        }
        String trimmedWord = word.substring(0, hi + 1);
        return trimmedWord;
    }
}
