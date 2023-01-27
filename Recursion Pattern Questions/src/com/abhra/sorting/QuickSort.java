package com.abhra.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 1, 3};
//        quickSort(arr, 0, arr.length - 1);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int low, int high) {
        if(low >= high) {
            return;
        }
        int st = low;
        int end = high;
        int mid = st + (end - st) / 2;
        int pivot = arr[mid];
        while(st <= end) {
            while(arr[st] < pivot) {
                st++;
            }
            while(arr[end] > pivot) {
                end--;
            }

            if(st <= end) {
                int temp = arr[st];
                arr[st] = arr[end];
                arr[end] = temp;
                st++;
                end--;
            }
        }

        quickSort(arr, low, end);
        quickSort(arr, st, high);
    }
}
