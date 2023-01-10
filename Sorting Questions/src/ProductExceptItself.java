import java.util.Scanner;

public class ProductExceptItself {
    //~~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int[] res = productExceptSelf(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(res[i] + " ");
        }
        scn.close();
    }
    public static int[] productExceptSelf(int[] arr) {
        // write your code here
        int n = arr.length;
        int[] right = new int[n];
        int lmul = 1;
        for(int i = n - 1; i >= 0; i--) {
            lmul *= arr[i];
            right[i] = lmul;
        }
        lmul = 1;
        int[] res = new int[n];
        for(int i = 0; i < n - 1; i++) {
            res[i] = right[i + 1] * lmul;
            lmul *= arr[i];
        }
        res[n - 1] = lmul;
        return res;
    }

}