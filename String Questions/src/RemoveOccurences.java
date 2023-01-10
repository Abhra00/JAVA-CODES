public class RemoveOccurences {

    public static void main(String[] args) {
        String str = "daabcbaabcbc";
        String part = "abc";
        System.out.println(removeOccurences(str, part));
    }

    static String removeOccurences(String str, String part) {
        while(str.contains(part)) {
            str = str.replace(part, "");
        }
        return str;
    }
}
