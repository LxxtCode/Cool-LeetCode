/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * 思路：同时遍历两个链表数值,注意进位和边界情况。
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function (l1, l2) {
    let node = new ListNode(0);

    let l3 = node;
    l3.next = new ListNode(0);
    while (l1 || l2) {
        l3 = l3.next;
        l3.next = new ListNode(0);
        if (l1) {
            l3.val += l1.val;
            l1 = l1.next;
        }
        if (l2) {
            l3.val += l2.val;
            l2 = l2.next;
        }
        if (l3.val >= 10) {
            l3.next.val++;
            l3.val -= 10;
        }
    }
    if (l3.next.val === 0) l3.next = null;
    return node.next;
};