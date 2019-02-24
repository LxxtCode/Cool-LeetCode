using System;

public class Solution
{

    /*
    * ListNode:非空 的链表用来表示两个非负的整数
    * 思路：将链表中的数字存入集合 遍历读取求和得到对应的数字，注意倒序输出
    * 其他：
   */

    public LinkedListNode addTwoNumbers(LinkedListNode l1, LinkedListNode l2)
    {
        List<int> arrayList1 = new List<int>();
        List<int> arrayList2 = new List<int>();
        LinkedListNode currentNode1 = l1;
        LinkedListNode currentNode2 = l2;
        while (currentNode1 != null)
        {
            arrayList1.Add(currentNode1.val);
            currentNode1 = currentNode1.next;
        }
        while (currentNode2 != null)
        {
            arrayList2.Add(currentNode2.val);
            currentNode2 = currentNode2.next;
        }
        int maxSize = arrayList1.Count() > arrayList2.Count() ? arrayList1.Count() : arrayList2.Count();
        LinkedListNode firstNode = null;
        LinkedListNode currentNode = null;
        int addNumber = 0;
        for (int i = 0; i <= maxSize; i++)
        {
            int num1 = 0;
            int num2 = 0;
            num1 = arrayList1[i];
            num2 = arrayList2[i];
            int currentNumber = (num1 + num2 + addNumber) % 10;
            addNumber = (num1 + num2 + addNumber) / 10;
            if (currentNumber == 0 && i == maxSize)
            {
                continue;
            }
            LinkedListNode nextNode = new LinkedListNode(currentNumber);
            if (firstNode == null)
            {
                firstNode = nextNode;
            }
            else
            {
                currentNode.next = nextNode;
            }
            currentNode = nextNode;
        }
        return firstNode;
    }

}
