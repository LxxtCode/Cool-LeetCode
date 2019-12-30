package com.leetcode.solutions.NO_0053_最大子序和;

/**
 * Created by gang.xu01@hand-china.com on 2019/12/29
 *
 * @author gang.xu01@hand-china.com
 */
public class Solution {

    /**
     * 思路: 将需求转化为求解当前连续和和当前最大值的比较
     */
    public int maxSubArray(int[] nums) {
        // 和小 和大 [-2,1,-3,4,-1,2,1,-5,4]
        if (nums.length == 0) {
            return 0;
        }
        int sum = nums[0];
        int max = sum;
        for (int i = 1; i < nums.length; i++) {
            sum = Integer.max(sum + nums[i], nums[i]);
            max = Integer.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args) {
        new Solution().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
    }

}
