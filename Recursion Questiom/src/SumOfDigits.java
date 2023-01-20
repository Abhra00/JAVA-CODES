public class SumOfDigits {
    public static void main(String[] args) {
        int n = 42;
        System.out.println(sumOfDigits(n));
    }

    static int sumOfDigits(int n) {
        if(n == 0) {
            return n;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }
}
