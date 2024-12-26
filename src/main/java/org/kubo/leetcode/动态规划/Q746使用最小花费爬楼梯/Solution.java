package org.kubo.leetcode.动态规划.Q746使用最小花费爬楼梯;

import org.kubo.Utils.ParseUtils;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(
                ParseUtils.strToIntArr("[10,15,20]")
        ));
    }

    /**
     * [1,2,3,100,1,100,1,1,100,1]
     */
    public static int minCostClimbingStairs(int[] cost) {
        if (cost.length <= 2) {
            return 0;
        }
//        dpn:第n阶 花费的最小费用
//        dp[i] = min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2])
        int[] dp = new int[cost.length + 1];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= cost.length; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        System.out.println(Arrays.toString(dp));
        return dp[cost.length];
    }

}
