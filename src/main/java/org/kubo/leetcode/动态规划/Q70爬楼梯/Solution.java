package org.kubo.leetcode.动态规划.Q70爬楼梯;

public class Solution {

    public static void main(String[] args) {
        System.out.println(climbStairs(2));
    }

    /**
     * 思路：
     */
    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
//        存储中间值
        int[] dp = new int[n];
//        推到：如何上到第n个台阶：
//              1. n-1个台阶，然后爬一步
//              2. n-2个台阶，然后爬两步
//        -> dp[n-2] + dp[n-1]
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }
        return dp[n - 1];
    }
}
