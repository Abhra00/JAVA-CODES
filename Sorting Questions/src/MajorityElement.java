import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        printMajorityElement(arr);
        scn.close();
    }

    public static void printMajorityElement(int[] arr) {
        // write your code here
        int count = 0;
        int ele = 0;
        for (int element : arr) {
            
            if(count == 0) {
                ele  = element;
            }
            if(ele == element) {
                count++;
            } else {
                count--;
            }
        }
        count = 0;
        for(int i = 0; i < arr.length; i++) {
           if(arr[i] == ele) {
               count++;
           }
        }
        if(count > arr.length / 2) {
            System.out.println(ele);
        } else {
            System.out.println("No Majority Element exist");
        }
    }
}
    
