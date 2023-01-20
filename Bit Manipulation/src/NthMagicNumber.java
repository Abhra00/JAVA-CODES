public class NthMagicNumber {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(magicNumber(n));
    }
    static int magicNumber(int n) {
        int ans = 0;
        int base = 5;
        while(n != 0) {
            int lastBit = n & 1;
            ans += lastBit * base;
            base = base * 5;
            n = (n >> 1);
        }
        return ans;
    }
}
