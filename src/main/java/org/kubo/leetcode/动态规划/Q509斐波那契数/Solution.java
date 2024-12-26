package org.kubo.leetcode.动态规划.Q509斐波那契数;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(fib2(4));
    }

    /**
     * 递归，并且有重复的计算
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


    public static int fib2(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println(Arrays.toString(dp));
        return dp[n];
    }
}
