package com.leetcode.solutions.NO_0001_两数之和;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by gang.xu01@hand-china.com on 2018/12/16
 */
public class Solution {

    /**
     * 解法：定义一个HashMap的key-value集合，只需要遍历源数组一遍，每次检测map中是否存在差值，
     *      存在则返回当前两个值，不存在则将当前值存放进去，此时间复杂度为O(n)
     *
     * @param nums 源数组
     * @param target 合计值
     * @return int[]和为合计值的两个值组成的数组
     */
    private int[] sumValues(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if (map.containsKey(value)) return new int[]{map.get(value), i};
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No such values!");
    }

}
