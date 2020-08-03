package com.leetcode.solutions.NO_0104_二叉树的最大深度;

/**
 * Created by gang.xu01@hand-china.com on 2020/7/28
 *
 * @author gang.xu01@hand-china.com
 */
public class Solution {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
