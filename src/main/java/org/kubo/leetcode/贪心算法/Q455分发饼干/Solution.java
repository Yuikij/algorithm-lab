package org.kubo.leetcode.贪心算法.Q455分发饼干;

import org.kubo.Utils.ParseUtils;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(findContentChildren(ParseUtils.strToIntArr("[1,2]")
                , ParseUtils.strToIntArr("[1,2,3]")));
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int g_index = 0;
        for (int sv : s) {
            if (g_index == g.length) {
                break;
            }
            int gv = g[g_index];
            if (gv <= sv) {
                g_index++;
            }
        }
        return g_index;
    }


}
