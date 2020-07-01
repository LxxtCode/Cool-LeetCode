package com.leetcode.solutions.NO_0069_x的平方根;

/**
 * Created by gang.xu01@hand-china.com on 2019/12/30
 *
 * @author gang.xu01@hand-china.com
 */
public class Solution {

    public int mySqrt(int x) {
        if (x <= 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        // 返回向上整数部分 4 -> 2  8 -> 2
        // 采用二分法，一到小数即可返回
        double high = x;
        double low = 1;
        double mid = 0;
        while ((int) low < (int) high) {
            mid = (high + low) / 2;
            if (mid * mid > x) {
                high = mid;
            } else {
                low = mid;
            }
        }
        return (int)mid;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().mySqrt(16));
    }
}
