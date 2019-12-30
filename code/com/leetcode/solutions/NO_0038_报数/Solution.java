package com.leetcode.solutions.NO_0038_报数;

/**
 * Created by gang.xu01@hand-china.com on 2019/12/29
 *
 * @author gang.xu01@hand-china.com
 */
public class Solution {

    public String countAndSay(int n) {
        if (n < 1 || n > 30) {
            throw new RuntimeException("越界了");
        }
        String start = "1";
        if (n == 1) {
            return start;
        }
        for (int i = 1; i < n; i++) {
            start = this.deal(start);
        }
        return start;
    }

    private String deal(String v) {
        int start = 0;
        char p = v.charAt(0);
        StringBuffer r = new StringBuffer();
        for (int i = 1; i < v.length(); i++) {
            if (p != v.charAt(i)) {
                r.append(i - start).append(p);
                p = v.charAt(i);
                start = i;
            }
        }
        if (v.length() > start) {
            r.append(v.length() - start).append(p);
        }
        return r.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().countAndSay(4));
    }
}
