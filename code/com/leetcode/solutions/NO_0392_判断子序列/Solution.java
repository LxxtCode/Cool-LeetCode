package com.leetcode.solutions.NO_0392;

/**
 * Created by gang.xu01@hand-china.com on 2020/7/27
 *
 * @author gang.xu01@hand-china.com
 */
public class Solution {

    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }
        int c = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (; c < t.length(); c++) {
                if (s.charAt(i) == t.charAt(c)) {
                    count++;
                    break;
                }
            }
        }
        return s.length() == count;
    }
}
