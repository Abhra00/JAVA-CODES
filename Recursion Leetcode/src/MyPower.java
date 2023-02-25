public class MyPower {
    public static void main(String[] args) {
        System.out.println(myPow(2, 10));
    }

    static double myPow(int x, int n) {
        if(n < 0) {
            return 1 / myPowHelper(x, (-1)*n);
        }

        return myPowHelper(x, n);
    }

    static double myPowHelper(double x, int n) {
        if(n == 0) {
            return 1;
        }

        double ans = myPowHelper(x, n / 2);
        ans *= ans;

        if(n % 2 != 0) {
            ans *= x;
        }
        return ans;
    }

}