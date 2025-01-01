package com.wexad.dsa_tutorial_geeksforgeeks.logic_building_problems;

import java.util.LinkedList;
import java.util.Queue;

public class JumpingNumbers {
    public static void printJumpingNumbers(int n) {
        System.out.print(0 + " ");
        for (int i = 1; i <= 9 && i <= n; i++) {
            bfs(n, i);
        }
    }

    private static void bfs(int n, int i) {
        Queue<Integer> nums = new LinkedList<>();
        nums.add(i);
        while (!nums.isEmpty()) {
            Integer current = nums.poll();
            System.out.print(current + " ");
            if (current > n) {
                continue;
            }
            int lastDigit = current % 10;
            if (lastDigit > 0) {
                int nextNum = current * 10 + lastDigit - 1;
                if (nextNum <= n) {
                    nums.add(nextNum);
                }
            }
            if (lastDigit < 9) {
                int nextNum = current * 10 + lastDigit + 1;
                if (nextNum <= n) {
                    nums.add(nextNum);
                }
            }
        }
    }

    public static void main(String[] args) {
        int x = 40;
        printJumpingNumbers(x);
    }
}

