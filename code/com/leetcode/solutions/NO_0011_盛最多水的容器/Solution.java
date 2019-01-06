package com.leetcode.solutions.NO_0011_盛最多水的容器;

/**
 * Created by gang.xu01@hand-china.com on 2019/1/6
 */
public class Solution {

    /**
     * 解法：指针满足比长度小的条件便从两边向中间移动，直到取到最大值
     *
     * @param height
     * @return
     */
    public int maxArea(int[] height) {

        int left = 0,
            right = height.length - 1,
            area = 0,
            l, r;

        while (left < right) {
            area = Math.max((right - left) * Math.min(height[left], height[right]), area);
            l = height[left];
            r = height[right];
            if (l < r) while (l >= height[left] && left < right) left++;
            else while (r >= height[right] && left < right) right--;
        }

        return area;
    }

    public static void main(String[] args) {
        new Solution().maxArea(new int[]{1,8,6,2,5,4,8,3,7});
    }
}
