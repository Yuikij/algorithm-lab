package org.kubo.leetcode.贪心算法.Q53最大子数组和;

import org.kubo.Utils.ParseUtils;

public class Solution {

    public static void main(String[] args) {
        System.out.println(wiggleMaxLength(ParseUtils.strToIntArr("[1,17,5,10,13,15,10,5,16,8]")
        ));
    }

    public static int wiggleMaxLength(int[] nums) {
        int length = 1;
        //当前差值
        int curDiff = 0;
        //上一个差值
        int preDiff = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            curDiff = nums[i] - nums[i + 1];
            //如果当前差值和上一个差值为一正一负
            //等于0的情况表示初始时的preDiff
            if ((curDiff > 0 && preDiff <= 0) || (curDiff < 0 && preDiff >= 0)) {
                length++;
                preDiff = curDiff;
            }
        }
        return length;
    }
}
