import java.util.Scanner;

public class sortArrayByParity {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        sortArrayParity(arr);

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        scn.close();
    }

    static void sortArrayParity(int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }
    
}
