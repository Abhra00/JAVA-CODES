public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {12, 9, 12, 7};
        System.out.println("The second largest element is -> " + arr[secondLargest(arr)]);
    }

    static int secondLargest (int[] arr) {
        int secondLargest = -1;
        int largest = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[largest]) {
                secondLargest = largest;
                largest = i;
            } else if (arr[i] != arr[largest]) {
                if(secondLargest == -1 || arr[i] > arr[secondLargest]) {
                    secondLargest = i;
                }
            }
        }
        return secondLargest;
    }
}
