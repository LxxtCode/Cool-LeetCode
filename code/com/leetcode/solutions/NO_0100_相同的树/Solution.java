package com.leetcode.solutions.NO_0100_相同的树;

/**
 * Created by gang.xu01@hand-china.com on 2019/12/30
 *
 * @author gang.xu01@hand-china.com
 */
public class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 中序遍历
        // 继续的条件
        if (p == null && q == null) {
            return true;
        }
        if (p != null && q != null && p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        } else {
            return false;
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
}
