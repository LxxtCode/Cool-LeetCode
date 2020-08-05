package com.leetcode.solutions.NO_0415_字符串相加;

/**
 * Created by gang.xu01@hand-china.com on 2020/8/3
 *
 * @author gang.xu01@hand-china.com
 */
public class Solution {

    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0, i = num1.length() - 1, j = num2.length() - 1;
        while (i >= 0 || j >= 0 || carry != 0) {
            if (i >= 0) carry += num1.charAt(i--) - '0';
            if (j >= 0) carry += num2.charAt(j--) - '0';
            sb.append(carry % 10);
            carry /= 10;
        }
        return sb.reverse().toString();
    }

}
