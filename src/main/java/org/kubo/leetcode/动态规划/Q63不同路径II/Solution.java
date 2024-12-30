package org.kubo.leetcode.动态规划.Q63不同路径II;

import static org.kubo.Utils.ParseUtils.convertStringToIntArray;

public class Solution {

    public static void main(String[] args) {
        System.out.println(uniquePathsWithObstacles(
                convertStringToIntArray("[[0,0,0],[0,1,0],[0,0,0]]")
        ));
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][j] == 1){
                    continue;
                }
                if (i == 0) {
                    if ((j > 0 && dp[i][j - 1] == 0)) {
                        dp[i][j] = 0;
                    } else {
                        dp[i][j] = 1;
                    }
                } else if (j == 0) {
                    if ( dp[i - 1][j] == 0) {
                        dp[i][j] = 0;
                    } else {
                        dp[i][j] = 1;
                    }
                } else {
                    int left =dp[i - 1][j];
                    int top =  dp[i][j - 1];
                    dp[i][j] = left + top;
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}
