package org.kubo.leetcode.贪心算法.Q406根据身高重建队列;

import org.kubo.Utils.ParseUtils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(reconstructQueue(
                ParseUtils.convertStringToIntArray("[[5,1],[5,0]]")
        )));
    }
/*
*   [[7,0],[4,4],[7,1],[5,0],[6,1],[5,2]]
*   [[7,0],[7,1],[6,1],[5,0],[5,2],[4,4]]
*   [[7,0],[6,1],[7,1],[5,0],[5,2],[4,4]]
*   [[5,0],[7,0],[5,2],[6,1],[4,4],[7,1]]
*
*   [[5,0],[7,0],[5,2],[6,1],[4,4],[7,1]]
*
*   思路：构造可以遍历一遍的规则
* */
    public static int[][] reconstructQueue(int[][] people) {
        LinkedList<int[]> que = new LinkedList<>();
        Arrays.sort(people, (a, b) -> {
//          防止第一个不是index 0
            if (a[0] == b[0]) return a[1] - b[1];
            return b[0] - a[0];
        });
        for (int[] person : people) {
            que.add(person[1], person);
        }
        return que.toArray(new int[people.length][]);
    }
}
