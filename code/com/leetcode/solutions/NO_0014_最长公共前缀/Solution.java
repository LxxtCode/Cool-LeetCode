package com.leetcode.solutions.NO_0014_最长公共前缀;

/**
 * Created by gang.xu01@hand-china.com on 2019/1/19
 */
public class Solution {

    /**
     * 解法：从数组第一个字符串开始向后推，如果遇到小的就把用它作为核心比较字符串，依次类推取出最长前缀
     *
     * @param strs 输入字符串
     * @return
     */
    public String longestCommonPrefix(String[] strs) {
        int arrL = strs.length;
        if (arrL == 0) return "";
        String s0 = strs[0];
        int arr0 = s0.length();
        char code;
        for (int i = 0; i < arr0; i++) {
            code = s0.charAt(i);
            for (int j = 0; j < arrL; j++) {
                String str = strs[j];
                if ("".equals(str)) return "";
                if (str.charAt(i) != code)
                    if (i == 0) return "";
                    else return s0.substring(0, i);
                if (str.length() < arr0) {
                    s0 = str;
                    arr0 = s0.length();
                }
            }
        }
        return s0;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().longestCommonPrefix(new String[]{}));
    }

}
