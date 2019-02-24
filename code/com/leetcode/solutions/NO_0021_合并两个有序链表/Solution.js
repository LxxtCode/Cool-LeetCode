/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * 思路：设指针l1、l2指向链表1、2，比较指针对应节点的大小并合并，然后后移较小节点指针
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var mergeTwoLists = function (l1, l2) {
    let head, newList;
    if (l1 === null) return l2;
    if (l2 === null) return l1;
    if (l1.val >= l2.val) {
        head = l2;
        l2 = l2.next;
    } else {
        head = l1;
        l1 = l1.next;
    }
    newList = head;

    while (l1 && l2) {
        if (l1.val >= l2.val) {
            newList = newList.next = l2;
            l2 = l2.next;
        } else {
            newList = newList.next = l1;
            l1 = l1.next;
        }
    }

    if (l1 !== null) {
        newList.next = l1;
    } else if (l2 !== null) {
        newList.next = l2;
    }

    return head;
};