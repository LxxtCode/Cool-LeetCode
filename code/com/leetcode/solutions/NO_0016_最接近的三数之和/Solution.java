package com.leetcode.solutions.NO_0016_最接近的三数之和;

/**
 * Created by gang.xu01@hand-china.com on 2020/7/6
 *
 * @author gang.xu01@hand-china.com
 */
public class Solution {

    public int threeSumClosest(int[] nums, int target) {
        // 定义三个指针
        int count = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    count = Math.abs(target - nums[i] - nums[j] - nums[k]) > Math.abs(target - count)
                            ? count : nums[i] + nums[j] + nums[k];
                }
            }
        }
        return count;
    }

}
