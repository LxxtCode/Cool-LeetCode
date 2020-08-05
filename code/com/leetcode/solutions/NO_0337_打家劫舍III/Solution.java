package com.leetcode.solutions.NO_0337_打家劫舍III;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by gang.xu01@hand-china.com on 2020/8/5
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

    private Map<TreeNode, Integer> steal = new HashMap<>();
    private Map<TreeNode, Integer> notSteal = new HashMap<>();

    public int rob(TreeNode root) {
        dfs(root);
        return Math.max(steal.getOrDefault(root, 0), notSteal.getOrDefault(root, 0));
    }

    private void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.left);
        dfs(root.right);
        steal.put(root, root.val + notSteal.getOrDefault(root.left, 0) + notSteal.getOrDefault(root.right, 0));
        notSteal.put(root,
                Math.max(steal.getOrDefault(root.left, 0), notSteal.getOrDefault(root.left, 0))
                + Math.max(steal.getOrDefault(root.right, 0), notSteal.getOrDefault(root.right, 0)));
    }
}
