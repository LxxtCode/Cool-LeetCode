package com.leetcode.solutions.NO_0083_删除排序链表中的重复元素;

/**
 * Created by gang.xu01@hand-china.com on 2020/7/1
 *
 * @author gang.xu01@hand-china.com
 */
public class Solution {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        head.next = deleteDuplicates(head.next);
        // 递归
        if (head.val == head.next.val) {
            head = head.next;
        }
        return head;
    }

}
