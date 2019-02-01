package com.leetcode.solutions.NO_0015_三数之和;

import java.util.*;

/**
 * Created by gang.xu01@hand-china.com on 2019/1/19
 */
public class Solution {

    /**
     * 解法：将数组排序，定义三个指针，分别移动，使得前两个的和等于第三个的负数值，转化为两数之和
     *
     * @param nums 输入数组
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int len = nums.length;
        if (len < 3) return list;
        Arrays.sort(nums);
        int max = nums[len - 1];
        if (max < 0) return list;
        for (int i = 0; i < len - 2; ) {
            if (nums[i] > 0) break;
            if (nums[i] + 2 * max < 0) {
                while (nums[i] == nums[++i] && i < len - 2) ;
                continue;
            }
            int left = i + 1, right = len - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (nums[left] == nums[++left] && left < right) ;
                    while (nums[right] == nums[--right] && left < right) ;
                } else if (sum < 0) ++left;
                else --right;
            }
            while (nums[i] == nums[++i] && i < len - 2) ;
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().threeSum(new int[]{-5, 3, 2}));
    }

}
