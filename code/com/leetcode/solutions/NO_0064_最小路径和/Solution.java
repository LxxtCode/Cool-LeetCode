package com.leetcode.solutions.NO_0064_最小路径和;

/**
 * Created by gang.xu01@hand-china.com on 2020/7/23
 *
 * @author gang.xu01@hand-china.com
 */
public class Solution {

    public int minPathSum(int[][] grid) {
        // 边界
        if (grid == null || grid.length <= 0 || grid[0].length <= 0) {
            return 0;
        }

        // 定义横向偏移量
        int r = grid[0].length;
        // 定义纵向偏移量
        int l = grid.length;

        // 动态规划问题，每次拿最小即可
        int[][] result = new int[l][r];
        result[0][0] = grid[0][0];

        for (int i = 1; i < r; i++) {
            result[0][i] = result[0][i - 1] + grid[0][i];
        }

        for (int i = 1; i < l; i++) {
            result[i][0] = result[i - 1][0] + grid[i][0];
        }

        for (int i = 1; i < l; i++) {
            for (int j = 1; j < r; j++) {
                result[i][j] = Math.min(result[i -1][j], result[i][j - 1]) + grid[i][j];
            }
        }

        return result[l - 1][r - 1];
    }

}
