public class FrequenciesInArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,2,3};
        System.out.println(count(arr, 6, 2));
    }
    static int count(int[] arr, int n, int x) {
        // code here
        int count = 1;
        int ele = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == ele) {
                count++;
            } else {
                if(count == x) {
                    return count;
                }
                ele = arr[i];
                count = 1;
            }
        }
        return -1;
    }
}
