package org.kubo.leetcode.贪心算法.Q860柠檬水找零;

import org.kubo.Utils.ParseUtils;

public class Solution {

    public static void main(String[] args) {
        System.out.println(lemonadeChange(
                ParseUtils.strToIntArr("[5,5,5,5,20,20,5,5,20,5]")));
    }

    /**
     *
     */
    public static boolean lemonadeChange(int[] bills) {
        int remaining10 = 0;
        int remaining5 = 0;
        for (int bill : bills) {
            if (bill == 20) {
                if (remaining10 > 0) {
                    remaining10 -= 10;
                    remaining5 -= 5;
                } else {
                    remaining5 -= 15;
                }
            }
            if (bill == 10) {
                remaining5 -= 5;
            }

            if (remaining5 < 0) {
                return false;
            }

            if (bill == 5) {
                remaining5 += 5;
            }
            if (bill == 10) {
                remaining10 += bill;
            }
        }
        return true;
    }

}
