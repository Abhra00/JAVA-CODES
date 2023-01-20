public class CheckPrime {
    public static void main(String[] args) {
        int num = 25;
        if(isPrime(num)) {
            System.out.println("Yes!! it is a prime number");
        } else {
            System.out.println("No!! it is a prime number");
        }
    }

    static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }
        for(int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
