package com.leetcode.solutions.NO_0028_实现strStr;

/**
 * Created by gang.xu01@hand-china.com on 2019/12/25
 */
public class Solution {

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }

        return haystack.indexOf(needle);
    }

}
