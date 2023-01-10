import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class MajorityElementGeneral {
    public static ArrayList<Integer> majorityElement(int[] arr, int k) {
        // write yout code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i]) == true) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int key : map.keySet()) {
            if(map.get(key) > (n / k)) {
                ans.add(key);
            }
        }
        Collections.sort(ans);
        return ans;
    }
   
     //~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        ArrayList<Integer> res = majorityElement(arr, k);
        System.out.println(res);
        scn.close();
    }
}
