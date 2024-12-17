package org.kubo.leetcode.贪心算法.Q860柠檬水找零;

import org.kubo.Utils.ParseUtils;

public class Solution {

    public static void main(String[] args) {
        System.out.println(candy(
                ParseUtils.strToIntArr("[1,6,10,8,7,3,2]")));
    }

    /**
     * 思路：一遍解决不了。遍历两遍
     */
    public static int candy(int[] ratings) {
        int num = 1;
        int current = 1;
        int min = 1;
        int segmentation = 1;
        for (int i = 0; i < ratings.length - 1; i++) {
            if (ratings[i] > ratings[i + 1] && current - 1 <= 0) {
                current = current - 1;
                segmentation++;
                min = Math.min(min, current);
            } else if (ratings[i] >= ratings[i + 1]) {
                //补偿
                current = 1;
                if (min < 1) {
                    num = num + (1 - min) * segmentation;
                }
                segmentation = 1;
            } else {
                current = current + 1;
                segmentation++;
            }

            num = num + current;
        }
        if (min < 1) {
            num = num + (1 - min) * segmentation;
        }
        return num;
    }

}
