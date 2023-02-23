public class CountGoodNumbers {
    public static void main(String[] args) {
        System.out.println(countGoodNumbers(4));
    }


    static int countGoodNumbers(long n) {
        long odd = n / 2;
        long even = (n / 2) + (n % 2);
        long mod = 100_000_000_7;
        return (int)((power(5, even, mod) * power(4, odd, mod)) % mod);
    }

    static long power(long x, long y, long mod) {
        if(y == 0) {
            return 1;
        }
        long ans = power(x, y / 2, mod);
        ans = ans * ans;
        ans %= mod;
        if(y % 2 != 0) {
            ans = ans * x;
        }
        ans %= mod;
        return ans;

    }
}
