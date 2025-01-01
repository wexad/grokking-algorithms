package com.wexad.dsa_tutorial_geeksforgeeks.logic_building_problems;

public class PerfectNumbers {
    public static boolean isPerfect(int n) {
        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                if (i != n / i) {
                    sum += i + n / i;
                } else {
                    sum += i;
                }
            }
        }
        return sum == n && n != 1;
    }

    public static void main(String[] args) {
        System.out.println(isPerfect(6));
        System.out.println(isPerfect(34));
        System.out.println(isPerfect(28));
    }
}
