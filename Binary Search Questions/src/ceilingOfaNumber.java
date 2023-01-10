import java.util.Scanner;

public class ceilingOfaNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the size of your array:");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements:");
        for(int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the key you want to find in the array: ");
        int key = input.nextInt();
        int ans = ceilingNumber(arr , key);
        if (ans != -1){
            System.out.println("Your element is present in :-> " + ans +" no index");
        } else {
            System.out.println("Can't find your element");
        }
        input.close();
    }
    // return -1 if element doesn't exist in array
    static int ceilingNumber(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        if (key > arr[end]) {
            return -1;
        }
        while(start <= end) {
//            int mid = (start + end) / 2; // may be this can go out of integer range
//            Optimised way to find mid
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
