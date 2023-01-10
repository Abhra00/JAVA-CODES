public class RepetedStringMatch {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "cdabcdab";
        System.out.println(repeatedStringMatch(a, b));
    }

    static int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while(sb.length() < b.length()) {
            sb.append(a);
            count++;
        }

        if(sb.toString().contains(b)) {
            return count;
        }
        if(sb.append(a).toString().contains(b)) {
            return ++count;
        }
        return -1;
    }
    
}
