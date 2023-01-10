public class ShiftLettes {
    public static void main(String[] args) {
        String s = "abc";
        int[] shifts = {3,5,9};
        System.out.println(shiftLetters(s, shifts));
    }

    static String shiftLetters(String s, int[] shifts) {
        int sum = 0;
        for(int i = shifts.length - 1; i >= 0; i--) {
            sum += shifts[i] % 26;
            shifts[i] = sum;
        }
        char x = 'a' + 10;
        System.out.println(x);
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char ch = (char)((s.charAt(i) - 'a' + shifts[i]) % 26 + 'a');
            ans.append(ch);
        }
        return ans.toString();
    }
}
