import java.util.ArrayList;
import java.util.Scanner;

public class FirstNegetive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int k = input.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }
        firstNegetive(nums, k);
        input.close();
    }

    static void firstNegetive (int[] arr, int k) {
        int i = 0;
        int j = 0;
        int size = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        while(j < size) {
            if(arr[j] < 0) {
                ans.add(arr[j]);
            }
            if(j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if(ans.size() == 0) {
                    System.out.println("0");
                } else {
                    System.out.println(ans.get(0));
                    if(arr[i] == ans.get(0)) {
                        ans.remove(0);
                    }
                }
                i++;
                j++;
            }
        }
    }
}
