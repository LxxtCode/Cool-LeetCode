package com.leetcode.solutions.NO_0017_电话号码的字母组合;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by gang.xu01@hand-china.com on 2020/7/27
 *
 * @author gang.xu01@hand-china.com
 */
public class Solution {

    private Map<String, String> phone = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};

    private List<String> output = new ArrayList<>();

    private void deal(String combination, String next) {
        if (next.length() == 0) {
            // 最后一次结束
            output.add(combination);
        } else {
            // 继续组合
            String c = phone.get(next.substring(0, 1));
            for (int i = 0; i < c.length(); i++) {
                this.deal(combination + c.substring(i, i + 1), next.substring(1));
            }
        }
    }

    public List<String> letterCombinations(String digits) {
        if (digits.length() > 0) {
            this.deal("", digits);
        }
        return output;
    }
}
