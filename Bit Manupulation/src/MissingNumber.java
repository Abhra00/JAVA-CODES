public class MissingNumber{
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] arr) {
        int n = arr.length;
        int x1 = 0;
        int x2 = 0;
        for(int val : arr) {
            x1 = x1 ^ val;
        }
        for(int i = 1; i <= n + 1; i++) {
            x2 = x2 ^ i;
        }

        return (x1 ^ x2);
    }
}