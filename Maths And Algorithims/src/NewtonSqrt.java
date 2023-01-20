public class NewtonSqrt {
    public static void main(String[] args) {
        System.out.println(Sqrt(36));
    }

    static double Sqrt(double n){
        double x = n;
        double root = -1;
        while(true) {
            root = 0.5 * (x + (n / x));
            if(Math.abs(root - x) < 0.5) {
                break;
            }
            x = root;
        }
        return root;
    }
}
