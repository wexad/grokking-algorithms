package com.wexad.grokking_algorithm.chapter3;

public class Recursion {
    public static void main(String[] args) {
    }

    /**
     * this is not tail recursion
     * recursive call is not last action
     */
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    /**
     * this is tail recursion
     * recursive call is last action
     * there is no need to remember anything after the recursive call
     * behaving like loops
     */
    public static int factorial(int n, int result){
        if (n == 1) {
            return result;
        }
        return factorial(n - 1, result * n);
    }

    /**
     * recursive call is made before any other operations
     */
    public static void printNumbers(int n){
        if (n > 0) {
            printNumbers(n - 1);
            System.out.print(n);
        }
    }
}
