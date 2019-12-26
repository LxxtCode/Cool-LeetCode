package com.leetcode.solutions.NO_0021_合并两个有序链表;

/**
 * Created by gang.xu01@hand-china.com on 2019/12/25
 */
public class Solution {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    /**
     * 解法：有点笨，初始化一个节点后不断比较塞入
     *
     * @param l1 l
     * @param l2 r
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // init
        ListNode f;
        if (l1 == null && l2 != null) {
            return l2;
        }
        if (l1 != null && l2 == null) {
            return l1;
        }
        if (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                f = new ListNode(l1.val);
                // 考虑边界问题
                if (l1.next != null) {
                    this.deal(f, l1.next, l2);
                } else {
                    f.next = l2;
                }
            } else {
                f = new ListNode(l2.val);
                if (l2.next != null) {
                    this.deal(f, l1, l2.next);
                } else {
                    f.next = l1;
                }
            }
            return f;
        }
        return null;
    }

    private void deal(ListNode f, ListNode l1, ListNode l2) {
        if (l1.val <= l2.val) {
            f.next = new ListNode(l1.val);
            if (l1.next != null) {
                this.deal(f.next, l1.next, l2);
            } else {
                f.next.next = l2;
            }
        } else {
            f.next = new ListNode(l2.val);
            if (l2.next != null) {
                this.deal(f.next, l1, l2.next);
            } else {
                f.next.next = l1;
            }
        }
    }

    public static void main(String[] args) {
//        ListNode l1 = new ListNode(1);
    }

}
