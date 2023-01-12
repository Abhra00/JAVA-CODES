import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0; i <= 11; i++) {
            System.out.println(FibonacciFormula(i));
        }
    }

    static int FibonacciFormula(int n) {
        int ans = (int) ((Math.pow((1 + Math.sqrt(5)) / 2, n) - Math.pow((1 - Math.sqrt(5)) / 2, n)) / Math.sqrt(5));
        return ans;
    }

    static int fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
