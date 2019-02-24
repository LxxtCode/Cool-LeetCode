/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

var arrToList = (arr) => {
    let head = temp = new ListNode(-1)
    arr.forEach((v) => {
        temp = temp.next = new ListNode(v);
    });
    return head.next;
}

/**
 * 思路：将所有节点值放入数组内，排序后生成链表
 * @param {ListNode[]} lists
 * @return {ListNode}
 */
var mergeKLists = function (lists) {
    let arr = '';
    let list;
    while (lists.length) {
        list = lists.pop()
        while (list !== null) {
            arr += ',' + list.val;
            list = list.next;
        }
    }

    return arr ? arrToList(arr.slice(1).split(',').sort((a, b) => a - b)) : null;
};