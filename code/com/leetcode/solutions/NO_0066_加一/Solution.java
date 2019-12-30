package com.leetcode.solutions.NO_0066_加一;

/**
 * Created by gang.xu01@hand-china.com on 2019/12/29
 *
 * @author gang.xu01@hand-china.com
 */
public class Solution {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] %= 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        new Solution().plusOne(new int[]{9,9,8,9});
    }
}
