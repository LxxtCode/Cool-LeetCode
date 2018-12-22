package com.leetcode.solutions.NO_0005_最长回文子串;

/**
 * Created by gang.xu01@hand-china.com on 2018/12/22
 */
public class Solution {

    /**
     * 解法：
     *
     * @param s 原始字符串
     * @return
     */
    public String longestPalindrome(String s) {
        int max,
            start = 0,
            end = 0;
        for (int i = 0; i < s.length(); i++) {
            // 偶数
            int even = this.strLength(s, i, i+1);
            // 奇数
            int odd = this.strLength(s, i, i);
            max = Math.max(even, odd);
            if(max > end - start) {
                start = (i - (max - 1)/2);
                end = (i + max/2) + 1;
            }
        }
        return s.substring(start, end);
    }

    // 返回回文字符串长度

    /**
     *
     * @param s 原始字符串
     * @param left 起始中心坐标 左
     * @param right 起始中心坐标 右
     * @return
     */
    private int strLength(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().longestPalindrome("a"));
    }

}
