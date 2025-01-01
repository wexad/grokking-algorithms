package com.wexad.competitive_programmers_handbook;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        int[] array = {-1, 2, 4, -3, 5, 2, -5, 2};
        System.out.println(maximumSubArraySum(array));
    }

    public static int maximumSubArraySum(int[] array) {
        int best = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = Math.max(array[i], sum + array[i]);
            best = Math.max(best, sum);
            System.out.println(sum + "   " + best);
        }
        return best;
    }
}
