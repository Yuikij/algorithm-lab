package org.kubo.leetcode.动态规划.Q62不同路径;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(uniquePaths(1, 2));
    }

    /**
     * 思路：
     */
    public static int uniquePaths(int m, int n) {
        /*
         *
         * dp[i][j] = dp[i-1][j] + dp[i][j-1]
         *
         * */

        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1) {
                    dp[i][j] = 1;
                } else if (j == 1) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }

        System.out.println(Arrays.deepToString(dp));
        return dp[m][n];
    }
}
