package com.leetcode.solutions.NO_0013_罗马数字转整数;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by gang.xu01@hand-china.com on 2019/1/13
 */
public class Solution {

    private final HashMap<String, Integer> format = new HashMap<String, Integer>(){{
        put("M", 1000);
        put("D", 500);
        put("C", 100);
        put("L", 50);
        put("X", 10);
        put("V", 5);
        put("I", 1);
    }};

    /**
     * 解法：按照顺序排列，左小于右则减，左大于右则加
     *
     * @param s
     * @return
     */
    public int romanToInt(String s) {
        int result = 0, l, r = 0;
        if (s.length() == 1) return format.get(s);
        else for (int i = 0; i < s.length() - 1; i++) {
            l = format.get(String.valueOf(s.charAt(i)));
            r = format.get(String.valueOf(s.charAt(i + 1)));
            if (l < r) result -= l;
            else result += l;
            }
        result += r;
        return result;
    }
}
