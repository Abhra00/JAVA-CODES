import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateDPlaces {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4,5};
        System.out.println("Enter how many places you want to left rotate your array:");
        int d = input.nextInt();
        reverse(arr, 0 , d - 1);
        reverse(arr, d, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        input.close();
    }

    static void reverse (int[] arr, int start, int end) {
        while(start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap (int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
