/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * 使用两个间隔为n的指针，当后面的指针移动到结尾是，前面的指针即为删除位
 * @param {ListNode} head
 * @param {number} n
 * @return {ListNode}
 */
var removeNthFromEnd = function (head, n) {
    if (0 === n) { return head.next };
    let p = head, q = head;
    while (n--) { q = q.next };

    if (null === q) { return head.next; }

    while (q.next) {
        p = p.next;
        q = q.next;
    }
    p.next = p.next.next;
    return head;
};