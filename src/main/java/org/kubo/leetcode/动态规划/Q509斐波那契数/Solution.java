package org.kubo.leetcode.动态规划.Q509斐波那契数;

public class Solution {

    public static void main(String[] args) {
        System.out.println(fib(4));
    }

    /**
     * 思路：
     */
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
