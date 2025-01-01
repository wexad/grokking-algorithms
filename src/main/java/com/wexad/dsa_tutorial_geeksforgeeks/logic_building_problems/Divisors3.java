package com.wexad.dsa_tutorial_geeksforgeeks.logic_building_problems;

public class Divisors3 {
    public static void divisors3(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i * i + "\t");
            }
        }
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        divisors3(16);
    }
}
