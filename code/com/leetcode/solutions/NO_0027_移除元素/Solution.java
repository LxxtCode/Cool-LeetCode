package com.leetcode.solutions.NO_0027_移除元素;

/**
 * Created by gang.xu01@hand-china.com on 2019/12/25
 */
public class Solution {

    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        // 数组指针
        int result = 0;
        if (nums[0] != val) {
            result++;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[result++] = nums[i];
            }
        }
        return result;
    }

}
