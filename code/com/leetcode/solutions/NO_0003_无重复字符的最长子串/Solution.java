package com.leetcode.solutions.NO_0003_无重复字符的最长子串;

/**
 * Created by gang.xu01@hand-china.com on 2018/12/20
 */
public class Solution {

    /**
     *
     * @param s 输入的字符串
     * @return 最长不重复子串长度
     */
    public int lengthOfLongestSubstring(String s) {
        if (!isRepeat(s)) return s.length();
        // 分割成子串，根据长短排序

        // 检查是否有重复
        if (!isRepeat(s)) return s.length();

        return 0;
    }

    // 检查字符串中是否有重复
    private boolean isRepeat(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLongestSubstring("abca"));
    }
}
