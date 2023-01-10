import java.util.*;
public class MaxProductSubarray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		System.out.println(maxProduct(arr));
		input.close();
	}

	static int maxProduct(int[] arr) {
		int ans = arr[0];
		int max = ans;
		int min = ans;
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < 0) {
				int temp = max;
				max = min;
				min = temp;
			} 
			max = Math.max(arr[i], max * arr[i]);
			min = Math.min(arr[i], min * arr[i]);
			ans = Math.max(ans, max);
		}
		return ans;
	}
}