package com.wexad.dsa_tutorial_geeksforgeeks.logic_building_problems;

public class PrimeNumbers {
    public static boolean isPrime(int n) {
        boolean[] prime = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        return prime[n];
    }

    public static void main(String[] args) {
        System.out.println(isPrime(10));
        System.out.println(isPrime(14));
        System.out.println(isPrime(2));
        System.out.println(isPrime(5));
        System.out.println(isPrime(11));
    }
}
