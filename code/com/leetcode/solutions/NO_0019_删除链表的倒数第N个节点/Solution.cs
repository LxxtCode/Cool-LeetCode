using System;

public class Solution
{

    /*
    * 思路：定义LinkedListNode 找到第Length -1 的位置，移除节点后修改前后节点的上一个节点的next 和下一个节点的prev
    * 其他：
   */

    public LinkedListNode<int> removeNthFromEnd(LinkedListNode<int> head, int n)
    {

        LinkedListNode<int> dummy = new LinkedListNode<int>(0);
        dummy = head;

        LinkedListNode<int> rear = dummy;
        LinkedListNode<int> pre = dummy;
        int a = 0;
        while (pre.Next != null)
        {
            a++;
            pre = pre.Next;
            if (a >= n + 1)
            {

                rear = rear.Next;
            }
        }
        rear = rear.Next.Next;
        return dummy.Next;
    }

}
