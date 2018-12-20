package com.leetcode.solutions.NO_0003_无重复字符的最长子串;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by gang.xu01@hand-china.com on 2018/12/20
 */
public class Solution {

    /**
     * 解法：定义一个Set用来存放每一个字母，因为是需要去取它的不重复子串，那么我们设置一个左闭右开的区间，
     *      在每次遍历的时候，去判断Set中是否有重复的值，如果有，则从区间第一位开始删，直到没有重复值，继续向下滑动
     *      记录最大滑动距离便是我们需要的无重复最长子串了
     *
     * @param s 输入的字符串
     * @return 最长不重复子串长度
     */
    private int lengthOfLongestSubstring(String s) {
        Set<Character> sChar = new HashSet<>();
        int returnLength = 0,
                i = 0,
                j = 0,
                n = s.length();
        while (i < n && j < n) {
            if (sChar.contains(s.charAt(j))) {
                sChar.remove(s.charAt(i++));
            } else {
                sChar.add(s.charAt(j++));
            }
            returnLength = Math.max(returnLength, j - i);
        }
        return returnLength;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLongestSubstring("abdcabe"));
    }
}
