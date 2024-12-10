package org.kubo.leetcode.贪心算法.Q1005_K次取反后最大化的数组和;

import org.kubo.Utils.ParseUtils;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(
                largestSumAfterKNegations(
                        ParseUtils.strToIntArr("[-5,-3,-1,5,-4]"),4));
    }

    /**
     * 思路：问题转换
     */
    public static int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length&&k>0; i++) {
            if (nums[i]<0) {
                nums[i]=-nums[i];
                k--;
            }
        }
        if (k>0) {
            Arrays.sort(nums);
            nums[0]=k%2==1?-nums[0]:nums[0];
        }
        
        return Arrays.stream(nums).sum();
    }


}
