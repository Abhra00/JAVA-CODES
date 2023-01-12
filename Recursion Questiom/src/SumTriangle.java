import java.util.Arrays;

public class SumTriangle {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        sumTriangle(arr);
    }

    static void sumTriangle(int[] arr) {
        if(arr.length < 1) {
            return;
        }
        int[] temp = new int[arr.length - 1];
        for(int i = 0; i < arr.length - 1; i++) {
            int sum = arr[i] + arr[i + 1];
            temp[i] = sum;
        }
        sumTriangle(temp);
        System.out.println(Arrays.toString(arr));
    }
}
