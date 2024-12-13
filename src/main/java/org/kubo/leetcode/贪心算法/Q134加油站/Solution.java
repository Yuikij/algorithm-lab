package org.kubo.leetcode.贪心算法.Q134加油站;

import org.kubo.Utils.ParseUtils;

public class Solution {

    public static void main(String[] args) {
        System.out.println(canCompleteCircuit(
                ParseUtils.strToIntArr("[1,1,3]")
                , ParseUtils.strToIntArr("[2,2,3]")));
    }

    /**
     * 思路：结合题目（唯一解），反向排除
     */
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int curSum = 0;
        int totalSum = 0;
        int index = 0;
        for (int i = 0; i < gas.length; i++) {
            curSum += gas[i] - cost[i];
            totalSum += gas[i] - cost[i];
            if (curSum < 0) {
                index = (i + 1) % gas.length ;
                curSum = 0;
            }
        }
        if (totalSum < 0) return -1;
        return index;
    }

}
