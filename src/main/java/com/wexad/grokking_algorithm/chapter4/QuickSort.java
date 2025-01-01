package com.wexad.grokking_algorithm.chapter4;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] ints = {4, 2, 5, 3};
        quickSort(ints, 0, ints.length - 1);
        System.out.println(Arrays.toString(ints));

    }

    public static void quickSort(int[] ints, int low, int high) {
        if (low < high) {
            int pivotIndex = partion(ints, low, high);
            quickSort(ints, low, pivotIndex - 1);
            quickSort(ints, pivotIndex + 1, high);
        }
    }

    private static int partion(int[] ints, int low, int high) {
        int i = low - 1;
        int pivot = ints[high];
        for (int j = low; j < high; j++) {
            if (pivot > ints[j]) {
                i++;
                int curr = ints[j];
                ints[j] = ints[i];
                ints[i] = curr;
            }
        }
        ints[high] = ints[i + 1];
        ints[i + 1] = pivot;
        return i + 1;
    }
}
