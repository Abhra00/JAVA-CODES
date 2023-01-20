public class SortedArray {

    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 8};
        int start = 0;
        System.out.println(isSorted(arr, start));
    }

    static boolean isSorted(int[] arr, int start){
        if(start == arr.length - 1) {
            return true;
        }

        return (arr[start] < arr[start + 1]) && isSorted(arr, start + 1);
    }
}
