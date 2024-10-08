package com.wexad.chapter1;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {2, 45, 67, 77};
        System.out.println(System.nanoTime());
        System.out.println(binarySearch(numbers, 45));
        System.out.println(System.nanoTime());
        System.out.println(Arrays.binarySearch(numbers, 45)); // 3 times faster
        System.out.println(System.nanoTime());

    }

    private static int binarySearch(int[] numbers, int item) {
        if (!(numbers.length == 0)) {
            int low = 0;
            int high = numbers.length - 1;

            while (low <= high) {
                int mid = (low + high) / 2;
                int guess = numbers[mid];

                if (guess < item) {
                    low = mid + 1;
                } else if (guess > item) {
                    high = mid - 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
