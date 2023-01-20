public class ReverseNumber {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(reverseNumber(n));
    }

    static int reverseNumber(int n) {
        if(n == 0) {
            return n;
        }
        int base = (int)(Math.log10(n));
        return (int) ((n % 10) * Math.pow(10, base)) + reverseNumber(n / 10);
    }
}
