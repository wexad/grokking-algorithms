package com.wexad.dsa_tutorial_geeksforgeeks.logic_building_problems;

public class NumberDivisible4 {
    public static boolean numberDivisibleBy4(String s) {
        if (s.length() >= 2) {
            return ((s.charAt(s.length() - 2) - '0') * 10 + (s.charAt(s.length() - 1) - '0')) % 4 == 0;
        } else if (s.length() == 1) {
            return (s.charAt(0) - '0') % 4 == 0;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(numberDivisibleBy4("12"));
        System.out.println(numberDivisibleBy4("124"));
        System.out.println(numberDivisibleBy4("1"));
        System.out.println(numberDivisibleBy4("4"));
        System.out.println(numberDivisibleBy4("121"));
    }
}
