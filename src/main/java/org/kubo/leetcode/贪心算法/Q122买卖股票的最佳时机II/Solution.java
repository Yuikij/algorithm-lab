package org.kubo.leetcode.贪心算法.Q122买卖股票的最佳时机II;

import org.kubo.Utils.ParseUtils;

public class Solution {

    public static void main(String[] args) {
        System.out.println(maxProfit(ParseUtils.strToIntArr("[1,2,3,4,5]")));
    }

    /**
     * 思路：最大利润就是相邻的差值和
     */
    public static int maxProfit(int[] prices) {
        int sum = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            sum = sum + Math.max(prices[i + 1] - prices[i], 0);
        }
        return sum;
    }

}
