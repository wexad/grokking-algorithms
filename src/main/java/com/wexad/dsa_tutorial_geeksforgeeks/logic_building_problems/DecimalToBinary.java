package com.wexad.dsa_tutorial_geeksforgeeks.logic_building_problems;

public class DecimalToBinary {
    public static void decimalToBinary(int n) {
        int[] binaryNum = new int[32];
        int i = 0;
        while (n > 0) {
            binaryNum[i] = n % 2;
            n /= 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binaryNum[j]);
        }
    }

    public static void main(String[] args) {
        decimalToBinary(7);
        System.out.println();
        decimalToBinary(10);
    }
}
