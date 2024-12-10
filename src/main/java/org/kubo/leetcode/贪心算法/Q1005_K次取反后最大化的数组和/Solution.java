package org.kubo.leetcode.贪心算法.Q1005_K次取反后最大化的数组和;

import org.kubo.Utils.ParseUtils;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(
                largestSumAfterKNegations(
                        ParseUtils.strToIntArr("[4,2,3]"),1));
    }

    /**
     * 思路：问题转换
     */
    public static int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        for (int i = 0; i < k; i++) {

        }
        return 0;
    }


}
