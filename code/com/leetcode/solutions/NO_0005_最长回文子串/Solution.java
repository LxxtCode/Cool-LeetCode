package com.leetcode.solutions.NO_0005_最长回文子串;

/**
 * Created by gang.xu01@hand-china.com on 2018/12/22
 */
public class Solution {

    /**
     * 解法：首先明白回文数就是一个对称的数，对于字符串也是，那么很简单，我们只需要设置一个坐标，这个坐标从左往右滑动，这里需要注意的是
     *      数组长度是奇数或偶数是会影响到如何去判断的，假设最长子串是奇数个，那我们判断的时候只需要去往两边不断延伸，判断左右两端是否
     *      每次都相等。假设是偶数个的话，我们需要判断他和他相邻的是否相等，之后把它看做一整个，再做类似奇数的延伸就可以了。
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
