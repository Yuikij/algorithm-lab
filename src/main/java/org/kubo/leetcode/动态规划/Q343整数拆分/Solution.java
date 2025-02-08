package org.kubo.leetcode.动态规划.Q343整数拆分;

public class Solution {

    public static void main(String[] args) {
        System.out.println(integerBreak(10));
    }

    /**
     * 思考过程：
     * <p>
     * 2: 1+1
     * 3: 1+2
     * 4: 2+2
     * 5: 2+3
     * 6: 3+3
     * 7: 3+4
     * 8: 5+3
     * 9: 4+2+3
     * 10: 5+5
     */
    public static int integerBreak(int n) {
//        dp 是 下标n的最大乘积
        int[] dp = new int[n + 1];

//        初始化
        dp[2] = 1;
        dp[1] = 1;
//        推导：猜测是拆分最大的两个值，然后去两边的最大乘积，怎么拆不知道规律，就遍历
        for (int i = 3; i <= n; i++) {
//            dp[i] = Math.max(Math.max(2 * (i - 2), 2 * dp[i - 2]), Math.max(3 * (i - 3), 3 * dp[i - 3]));
            int max = 0;
            for (int j = 0; j < i; j++) {
                int r = i - j;
                max = dp[i] = Math.max(max, Math.max(dp[j], j) * Math.max(dp[r], r));
            }
        }
//        System.out.println(Arrays.toString(dp));
        return dp[n];
    }
}
