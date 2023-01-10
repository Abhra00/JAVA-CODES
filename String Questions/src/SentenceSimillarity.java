public class SentenceSimillarity {
    public static void main(String[] args) {
        String sentence1 = "A lot of words";
        String sentence2 = "of";
        boolean ans = areSentencesSimilar(sentence1, sentence2);
        System.out.println(ans);
    }

    static boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] s1 = sentence1.split(" ");
        String[] s2 = sentence2.split(" ");
        // Checking the smaller sentence
        if(s1.length >= s2.length) {
            return check(s1, s2);
        }
        return check(s2, s1);
    }
    
    static boolean check(String[] s1, String[] s2) {
        int n = s2.length;
        int lo = 0;
        while(lo  < n) {
            if(!s1[lo].equals(s2[lo])) {
                break;
            }
            lo++;
        }

        int hi = n - 1;
        while(hi >= lo) {
            if(!s1[s1.length + hi - s2.length].equals(s2[hi])) {
                break;
            }
            hi--;
        }
        return lo > hi;
    }
}
