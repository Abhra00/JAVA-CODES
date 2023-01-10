public class SB {
    public static void main(String[] args) {
        StringBuilder alphabets = new StringBuilder();
        for(int i = 0; i <26; i++) {
            char ch = (char) ('a' + i);
            alphabets.append(ch);
        }
        System.out.println(alphabets.toString());
        alphabets.setCharAt(25, 'o');
        System.out.println(alphabets);
    }
}
