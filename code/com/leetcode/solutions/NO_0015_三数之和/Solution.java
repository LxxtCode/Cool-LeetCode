package com.leetcode.solutions.NO_0015_三数之和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        int i, j, k;
        List<List<Integer>> rl = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        // 对数组进行排序
        Arrays.sort(nums);

        return null;
    }

    public static void main(String[] args) {
        new Solution().threeSum(new int[]{-14, 2, 3, 4});
    }

}
