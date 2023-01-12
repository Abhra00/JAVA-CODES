import java.util.Scanner;

public class MaxAND {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println(maxAND(arr));
        input.close();
    }
    static int getCount(int num, int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if((arr[i] & num )== num) {
                count++;
            }
        }
        return count;
    }
    static int maxAND(int[] arr) {
        int ans = 0;
        for(int i = 16; i >= 0; i--) {
            int x = ans | 1 << i;
            int count = getCount(x, arr);
            if(count >= 2) {
                ans = x;
            }
        }
        return ans;
    }
    
    
}
