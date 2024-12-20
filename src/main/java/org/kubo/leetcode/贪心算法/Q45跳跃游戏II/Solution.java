package org.kubo.leetcode.贪心算法.Q45跳跃游戏II;

import org.kubo.Utils.ParseUtils;

public class Solution {

    public static void main(String[] args) {
        System.out.println(jump(ParseUtils.strToIntArr("[2,1,0,1,4]")));
    }

    /**
     * 思路：问题转换
     */
    public static int jump(int[] nums) {
        int step = 0;
        int maxIndex = 0;
        int currentIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > currentIndex) {
                if (i > maxIndex) {
                    return 0;
                }
                currentIndex = maxIndex;
                step++;
            }
            maxIndex = Math.max(nums[i] + i, maxIndex);
        }
        return step;
    }

    public static int jump2(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return 0;
        }
        //记录跳跃的次数
        int count=0;
        //当前的覆盖最大区域
        int curDistance = 0;
        //最大的覆盖区域
        int maxDistance = 0;
        for (int i = 0; i < nums.length; i++) {
            //在可覆盖区域内更新最大的覆盖区域
            maxDistance = Math.max(maxDistance,i+nums[i]);
            //说明当前一步，再跳一步就到达了末尾
            if (maxDistance>=nums.length-1){
                count++;
                break;
            }
            //走到当前覆盖的最大区域时，更新下一步可达的最大区域
            if (i==curDistance){
                curDistance = maxDistance;
                count++;
            }
        }
        return count;
    }

}
