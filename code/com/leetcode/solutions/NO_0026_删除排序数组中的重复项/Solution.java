package com.leetcode.solutions.NO_0026_删除排序数组中的重复项;

/**
 * Created by gang.xu01@hand-china.com on 2019/12/25
 */
public class Solution {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        // 不同值指针
        int result = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[result] != nums[i]) {
                result++;
                nums[result] = nums[i];
            }
        }
        return result + 1;
    }


    public static void main(String[] args) {
        System.out.println(new Solution().removeDuplicates(new int[]{0, 2, 1, 1, 1, 2}));
    }

}
