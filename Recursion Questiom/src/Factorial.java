public class Factorial {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(5));
    }

    static int factorial(int n) {
        if(n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}