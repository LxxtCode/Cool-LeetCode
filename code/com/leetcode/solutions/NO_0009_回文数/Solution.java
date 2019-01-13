package com.leetcode.solutions.NO_0009_回文数;

/**
 * Created by gang.xu01@hand-china.com on 2019/1/13
 */
public class Solution {

    /**
     * 解法：取到中位数，直接判断前后是否一致，注意这里需要判断奇数或者偶数
     *
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {

        String sx = String.valueOf(x);
        int length = sx.length();
        boolean isOdd = length % 2 == 1;
        int mid = length / 2, l, r;
        boolean isP = true;

        l = mid - 1;
        if (isOdd) r = mid + 1;
        else r = mid;

        while (l >= 0 && r < length) {
            if (sx.charAt(l) != sx.charAt(r)) {
                isP = false;
                break;
            }
            l--;
            r++;
        }

        return isP;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome(121));
    }

}
