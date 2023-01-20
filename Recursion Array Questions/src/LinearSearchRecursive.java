public class LinearSearchRecursive {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 18, 23, 8};
        System.out.println(LinearSearch(arr, 12, 0));
    }

    static int LinearSearch(int[] arr, int target, int index) {
        if(index == arr.length - 1 && arr[index] != target) {
            return -1;
        }

        if(arr[index] == target) {
            return index;
        }

        return LinearSearch(arr, target, index + 1);
    }
}
