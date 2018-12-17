package com.leetcode.solutions.NO_0002_两数相加;

/**
 * Created by gang.xu01@hand-china.com on 2018/12/17
 */
public class Solution {

    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    /**
     * 将数组转化成链表
     *
     * @param list 数组
     * @return 链表
     */
    private ListNode buildListNode(int[] list){
        ListNode first = null, last = null,newNode;
        for(int i = 0; i < list.length; i++){
            newNode = new ListNode(list[i]);
            if(first == null){
                first = newNode;
                last = newNode;
            }else{
                last.next = newNode;
                last = newNode;
            }
        }
        return first;
    }

    /**
     * 解法：将链表
     *
     * @param l1 链表1
     * @param l2 链表2
     * @return 结果的链表
     */
    private ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    // 测试用例
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.addTwoNumbers(solution.buildListNode(new int[]{9, 9}), solution.buildListNode(new int[]{2}));
    }

}
