public class Factors {
    public static void main(String[] args) {
        int n = 20;
        printFactors(n);
    }

    static void printFactors(int n) {
        boolean[] factors = new boolean[n + 1];
        for(int i = 1; i * i <= n; i++) {
            if(n % i == 0) {
                int index = n / i;
                factors[i] = true;
                factors[index] = true;
            }
        }

        for(int i = 1; i <= n; i++) {
            if(factors[i]) {
                System.out.println(i);
            }
        }
    }
}
