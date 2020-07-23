package com.leetcode.solutions.NO_0088_合并两个有序数组;

/**
 * Created by gang.xu01@hand-china.com on 2020/7/1
 *
 * @author gang.xu01@hand-china.com
 */
public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 倒序拼接，因为左边的数组大小已经足够
        int count = m-- + n-- - 1;
        while (n >= 0) {
            if (m >= 0 && nums1[m] >= nums2[n]) {
                nums1[count--] = nums1[m--];
            } else {
                nums1[count--] = nums2[n--];
            }
        }
    }

}
