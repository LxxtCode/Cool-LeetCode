package com.leetcode.solutions.NO_0103_二叉树的锯齿形层次遍历;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean isTurn = true;
        List<List<Integer>> resultList = new ArrayList<>();
        while (!queue.isEmpty()) {
            int size = queue.size();
            LinkedList<Integer> list = new LinkedList<>();
            for (int i = 0; i < size; ++i) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
                if (isTurn) {
                    list.add(node.val);
                } else {
                    list.push(node.val);
                }
            }
            isTurn = !isTurn;
            resultList.add(list);
        }
        return resultList;
    }

}
