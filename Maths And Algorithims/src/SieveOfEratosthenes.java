public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int range = 10;
        boolean[] primes = new boolean[range + 1];
        sieve(range, primes);
    }

    static void sieve(int n, boolean[] primes) {
        for(int i = 2; i * i <= n; i++) {
            if(!primes[i]) {
                for(int j = i * 2; j <= n; j += i) {
                    primes[j] = true;
                }
            }
        }
        System.out.println("The prime number are from 1 to " + n + " is ->");
        for(int i = 2; i <= n; i++) {
            if(!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
