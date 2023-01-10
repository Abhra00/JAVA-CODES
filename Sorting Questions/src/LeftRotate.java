import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
        int[] arr = {5, 10, 30, 12};
        int d = 2;
        for(int i = 0; i < d; i++) {
            leftRotate(arr);
        }
        System.out.println(Arrays.toString(arr));
    }

    static void leftRotate (int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
}
