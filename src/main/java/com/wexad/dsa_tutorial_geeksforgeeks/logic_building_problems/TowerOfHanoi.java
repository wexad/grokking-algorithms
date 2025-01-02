package com.wexad.dsa_tutorial_geeksforgeeks.logic_building_problems;

public class TowerOfHanoi {
    public static void tower(int n, char from, char to, char mid) {
        if (n == 0) return;
        tower(n - 1, from, mid, to);
        System.out.println(n + "\tfrom\t" + from + "\tto\t" + to);
        tower(n - 1, mid, to, from);
    }

    public static void main(String[] args) {
        tower(3, 'a', 'c', 'b');
    }
}
