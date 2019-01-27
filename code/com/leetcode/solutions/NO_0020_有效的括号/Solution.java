package com.leetcode.solutions.NO_0020_有效的括号;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by gang.xu01@hand-china.com on 2019/1/27
 */
public class Solution {

    private HashMap<Character, Character> mappings;

    public Solution() {
        this.mappings = new HashMap<>();
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');
    }

    /**
     * 解法：先寻找规律，发现如果出现右半括号，那么必然会出现最近的左半括号，依次类推下去，借助栈顶来判断
     *
     * @param s
     * @return
     */
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (this.mappings.containsKey(c)) {
                char topElement = stack.empty() ? '#' : stack.pop();
                if (topElement != this.mappings.get(c)) return false;
            } else stack.push(c);
        }

        return stack.isEmpty();
    }

}
