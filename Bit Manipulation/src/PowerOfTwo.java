public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 18;
        System.out.println(isPowerOfTwo(n));
    }

    static boolean isPowerOfTwo(int n) {
        if(n == 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}
