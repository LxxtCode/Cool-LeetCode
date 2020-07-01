package com.leetcode.solutions.NO_0070_爬楼梯;

/**
 * Created by gang.xu01@hand-china.com on 2020/6/30
 *
 * @author gang.xu01@hand-china.com
 */
public class Solution {

    public int climbStairs(int n) {
        // 费氏数列 斐波那契数列
        if (n <= 2) {
            return n;
        }
        int l = 1;
        int r = 2;
        for (int i = 3; i <= n; i++) {
            int tmp = l + r;
            l = r;
            r = tmp;
        }

        return r;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().climbStairs(6));
    }

}
