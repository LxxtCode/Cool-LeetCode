package com.leetcode.solutions.NO_0008_字符串转换整数;

/**
 * Created by gang.xu01@hand-china.com on 2019/1/6
 */
public class Solution {

    /**
     * 解法：蛮无聊的题，使用asc码判断是否符合规则，最后判断边界问题即可
     *
     * @param str
     * @return
     */
    public int myAtoi(String str) {
        if (str == null || str.trim().equals("")) return 0;
        str = str.trim();
        StringBuilder sb = new StringBuilder();
        char c0 = str.charAt(0);
        if (c0 == 43 || c0 == 45 ||(c0 >= 48 && c0 <=57)) sb.append(c0);
        else return 0;
        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 48 && c <= 57) sb.append(c);
            else break;
        }
        try {
            return sb.length() == 1  && (c0 == 43 || c0 == 45) ? 0 :
                    Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return c0 == 45 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().myAtoi("3.1"));
    }

}
