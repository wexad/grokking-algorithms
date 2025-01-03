package com.wexad.dsa_tutorial_geeksforgeeks.array_data_structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicProblems {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getLeaders(new int[]{16, 17, 4, 3, 5, 2})));
    }

    public static int getLargest(int[] array) {
        if (array.length < 1) {
            return -1;
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        return max;
    }

    public static int getSecondLargest(int[] array) {
        Arrays.sort(array);
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] != array[i - 1]) {
                return array[i - 1];
            }
        }
        return -1;
    }

    public static int[] getLeaders(int[] arr) {
        List<Integer> leadersList = new ArrayList<>();
        int maxFromRight = arr[arr.length - 1];
        leadersList.add(maxFromRight);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                leadersList.add(maxFromRight);
            }
        }
        int[] leaders = new int[leadersList.size()];
        for (int i = 0; i < leadersList.size(); i++) {
            leaders[i] = leadersList.get(leadersList.size() - 1 - i);
        }
        return leaders;
    }

    public static List<List<Integer>> generateSubarrays(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubarraysHelper(arr, 0, 0, result);
        return result;
    }
    private static void generateSubarraysHelper(int[] arr, int start, int end, List<List<Integer>> result) {
        if (end == arr.length) {
            return;
        }
        if (start <= end) {
            List<Integer> subarray = new ArrayList<>();
            for (int i = start; i <= end; i++) {
                subarray.add(arr[i]);
            }
            result.add(subarray);
            generateSubarraysHelper(arr, start + 1, end, result);
        } else {
            generateSubarraysHelper(arr, 0, end + 1, result);
        }
    }
}
