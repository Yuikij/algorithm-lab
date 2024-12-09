package org.kubo.leetcode.贪心算法.Q53最大子数组和;

import org.kubo.Utils.ParseUtils;

public class Solution {

    public static void main(String[] args) {
        System.out.println(maxSubArray(ParseUtils.strToIntArr("[-1,-2,-3]")));
    }

    public static int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            max = Math.max(max, sum);
            if (sum  <= 0) {
                sum = 0;
            } 
           
        }
        return max;
    }


}
