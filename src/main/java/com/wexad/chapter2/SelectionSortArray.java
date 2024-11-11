package com.wexad.chapter2;

import java.util.Arrays;

public class SelectionSortArray {
    public static void main(String[] args) {
        int[] arr = {5, 4, 12, 0};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int curr = arr[i];
                    arr[i] = arr[j];
                    arr[j] = curr;
                }
            }
        }
    }
}
