package com.abhra.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1, 0 , -1, 8, 6, 5, 4};
        int start = 0;
        int end = arr.length;
        inPlaceMergeSort(arr, start, end);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr) {
        if(arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right) {
        int[] ans = new int[left.length + right.length];
        int idx = 0;
        int lStart = 0;
        int rStart = 0;
        while(lStart < left.length && rStart < right.length) {
            if(left[lStart] < right[rStart]) {
                ans[idx++] = left[lStart];
                lStart++;
            } else {
                ans[idx++] = right[rStart];
                rStart++;
            }
        }

        while(lStart <= left.length - 1) {
            ans[idx++] = left[lStart++];
        }
        while(rStart <= right.length - 1) {
            ans[idx++] = right[rStart++];
        }
        return ans;
    }
    static void inPlaceMergeSort(int[] arr, int start, int end) {
        if(end - start == 1) {
            return;
        }
        int mid = start + (end - start) / 2;
        inPlaceMergeSort(arr, start, mid);
        inPlaceMergeSort(arr, mid, end);
        mergeInplace(arr,start, mid, end);
    }

    static void mergeInplace(int[] arr,int start, int mid, int end) {
        int[] ans = new int[end - start];
        int lo = start;
        int hi = mid;
        int index = 0;
        while(lo < mid && hi < end) {
            if(arr[lo] < arr[hi]) {
                ans[index] = arr[lo];
                lo++;
            } else {
                ans[index] = arr[hi];
                hi++;
            }
            index++;
        }

        while(lo  < mid) {
            ans[index] = arr[lo];
            index++;
            lo++;
        }

        while(hi < end) {
            ans[index] = arr[hi];
            index++;
            hi++;
        }

        for(int i = 0; i < ans.length; i++) {
            arr[start + i] = ans[i];
        }
    }


}
