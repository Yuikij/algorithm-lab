package org.kubo.leetcode.HWOD;

import java.util.Scanner;


public class HJ5进制转换 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            String str = in.nextLine();
            str = str.substring(2);
            int sum = 0;
            for (int index = 0; index < str.length(); index++) {
                int n = str.charAt(index);
                if (n >= 48 && n <= 57) {
                    n = n - 48;
                }
                if (n >= 65) {
                    n = n - 54;
                }

                if (n > 97) {
                    n = n - 86;
                }
                sum += (int) Math.pow(16, str.length() - index - 1) * n;
            }
            System.out.println(sum);
        }
    }
}
