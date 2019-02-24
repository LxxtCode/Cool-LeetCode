/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * 思路：设置顺序指针 L、M、R，M、R为需要换交换节点，交换后指针后移两位
 * @param {ListNode} head
 * @return {ListNode}
 */
var swapPairs = function (head) {
    let L = new ListNode(-1), M = head; // L = new ListNode(-1) 防止越界
    L.next = M, head = L;
    if (M === null) return null;
    let R = M.next;

    while (R !== null) {
        // 交换 M R
        M.next = R.next;
        R.next = M;
        L.next = R;

        // 移动 L M R
        L = M, M = M.next;
        if (M === null) break;
        R = M.next;
    }

    return head.next;
};