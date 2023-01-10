public class NextGreaterElement {
    public static void main(String[] args) {
       int n = 65143;
       System.out.println(nextGreaterElement(n)); 
    }

    static int nextGreaterElement(int n) {
        char[] arr = String.valueOf(n).toCharArray();
        int len = arr.length;
        int i = len - 2;
        while(i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        if(i == -1) {
            return -1;
        }

        int k = len - 1;
        while(arr[i] >= arr[k]) {
            k--;
        }
        char temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
        StringBuilder res = new StringBuilder();
        for(int j = 0; j <= i; j++) {
            res.append(arr[j]);
        }
        for(int j = len - 1; j > i; j--) {
            res.append(arr[j]);
        }
        long ans = Long.valueOf(res.toString());
        if(ans > Integer.MAX_VALUE) {
            return -1;
        }
        return (int) ans;
    }
}
