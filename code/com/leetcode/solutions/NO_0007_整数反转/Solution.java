package com.leetcode.solutions.NO_0007_整数反转;

/**
 * Created by gang.xu01@hand-china.com on 2018/12/24
 */
public class Solution {

    /**
     * 解法：每次取余遍历*10+余即可，注意处理边界问题(可能出现在反过来的时候)
     *
     * @param x 输入整数(不包括越界)
     * @return int
     */
    private int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reverse(238278));
    }
}
