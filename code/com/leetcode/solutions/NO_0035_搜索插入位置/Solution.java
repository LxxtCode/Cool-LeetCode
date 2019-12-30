package com.leetcode.solutions.NO_0035_搜索插入位置;

/**
 * Created by gang.xu01@hand-china.com on 2019/12/25
 */
public class Solution {

    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        // 定义指针
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            } else if (nums[i] < target) {
                result++;
            } else {
                return result;
            }
        }
        return result;
    }

}
