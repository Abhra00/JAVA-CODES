public class RemoveAllOccurrencesOfACharacter {
    public static void main(String[] args) {
        String str = "baccad";
        System.out.println(skip("", str));

    }

    static String skip(String p, String up) {
        if(up.isEmpty()) {
            return p;
        }

        char ch = up.charAt(0);
        if(ch == 'a') {
            return skip(p, up.substring(1));
        } else {
            return skip(p + ch, up.substring(1));
        }
    }
}
