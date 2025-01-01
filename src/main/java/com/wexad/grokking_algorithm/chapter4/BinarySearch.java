package com.wexad.grokking_algorithm.chapter4;

public class BinarySearch {
    public static void main(String[] args) {
        int[] ints = {0, 1, 3, 5};
        System.out.println(binarySearch(ints,0, ints.length - 1, 0));
    }
    public static int binarySearch(int[] ints, int left, int right, int target) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (ints[mid] == target) {
            return mid;
        }
        if (ints[mid] > target) {
            return binarySearch(ints, left, mid - 1, target);
        }
        return binarySearch(ints, mid + 1, right, target);
    }
}
