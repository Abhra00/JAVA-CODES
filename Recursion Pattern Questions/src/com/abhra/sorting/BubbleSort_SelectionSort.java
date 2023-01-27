package com.abhra.sorting;

import java.util.Arrays;

public class BubbleSort_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1, 8, 9, 3, 7};
        int lastIndex = arr.length - 1;
        int start = 0;
        int maxIdx = 0;
        selectionSort(arr, lastIndex, start, maxIdx);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr, int index, int start) {
        if(index == 0) {
            return;
        }
        if(start < index) {
            if(arr[start] > arr[start + 1] && start <= arr.length - 1) {
                swap(arr, start, start + 1);
                bubbleSort(arr, index, start + 1);
            }
        } else {
            start = 0;
            bubbleSort(arr, index - 1, start);
        }
    }

    static void selectionSort(int[] arr, int index, int start, int maxIdx) {
        if(index == 0) {
            return;
        }
        if(start <= index) {
            if(arr[start] >= arr[maxIdx] && start <= arr.length - 1) {
                maxIdx = start;
            }
            selectionSort(arr, index, start + 1, maxIdx);
        } else {
            swap(arr, index, maxIdx);
            start = 0;
            maxIdx = 0;
            selectionSort(arr, index - 1, start, maxIdx);
        }
    }

    static void swap(int[] arr, int firstIdx, int secondIdx) {
        int temp = arr[firstIdx];
        arr[firstIdx] = arr[secondIdx];
        arr[secondIdx] = temp;
    }
}
