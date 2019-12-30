package com.leetcode.solutions.NO_0058_最后一个单词的长度;

/**
 * Created by gang.xu01@hand-china.com on 2019/12/29
 *
 * @author gang.xu01@hand-china.com
 */
public class Solution {

    public int lengthOfLastWord(String s) {
        s = s.trim();
        int start = s.lastIndexOf(" ") + 1;
        return s.substring(start).length();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLastWord("a "));
    }

}
