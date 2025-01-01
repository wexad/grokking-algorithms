package com.wexad.dsa_tutorial_geeksforgeeks.logic_building_problems;

public class PrimeFactorNumber {
    public static long largestPrimeNumber(long n) {
        long maxPrime = 0;
        while (n % 2 == 0) {
            maxPrime = 2;
            n /= 2;
        }
        for (long i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                maxPrime = i;
                n /= i;
            }
        }
        if (n > 2) {
            maxPrime = n;
        }
        return maxPrime;
    }


    public static void main(String[] args) {
        System.out.println(largestPrimeNumber(6));
    }
}
