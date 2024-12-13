package org.kubo.leetcode.贪心算法.Q134加油站;

import org.kubo.Utils.ParseUtils;

public class Solution2 {

    public static void main(String[] args) {
        System.out.println(canCompleteCircuit(
                ParseUtils.strToIntArr("[1,2,3,4,5]")
                , ParseUtils.strToIntArr("[3,4,5,1,2]")));
    }

    /**
     * 思路：结合题目（唯一解），反向排除
     */
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int remaining = 0;
        int sum = 0;
        int start = -1;
        for (int i = 0; i < gas.length; i++) {
            sum += gas[i] - cost[i];
            if (remaining + gas[i] - cost[i] < 0) {
                start = i + 1 % gas.length;
                remaining = 0;
            } else {

                remaining += gas[i] - cost[i];
            }
        }
        if (sum < 0) {
            return -1;
        }
        return start;
    }

}
