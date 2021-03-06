# 两数相加
## 题目
给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。

如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

示例：

~~~
输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 807
~~~

## 解法思路
将两个链表所有元素遍历，直到都为null为止，当一方为null的时候令他为0作为计算，这样可以处理很多边界临界值然后从第一位开始，两位相加，首先要判断是否进一，如果需要则保留这位1，在下次计算的时候将这位1再带入计算，由于链表的特性，所以本位是累加取余，其余往后累算，到最后的结果如果还需要进一则再加1