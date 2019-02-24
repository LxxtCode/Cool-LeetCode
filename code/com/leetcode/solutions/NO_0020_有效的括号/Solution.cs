using System;

public class Solution
{

    /*
    * 思路：通过Stack堆栈来实现，遍历字符串，如果堆栈为空则将字符入栈，栈顶和当前字符是否符合有效括号要求，符合则出栈，直到字符串全部遍历完。判断是否栈空
    * 其他：
   */

    public Boolean isValid(String s)
    {
        if (s.Length == 0)
            return true;
        int len = s.Length;
        char[] schararray = s.ToCharArray();
        Stack<char> sstack = new Stack<char>();
        for (int i = 0; i < len; i++)
        {
            if (0 == sstack.Count)
                sstack.Push(schararray[i]);
            else
            {
                if ((char)sstack.Peek() == '(' && schararray[i] == ')')
                    sstack.Pop();
                else if ((char)sstack.Peek() == '[' && schararray[i] == ']')
                    sstack.Pop();
                else if ((char)sstack.Peek() == '{' && schararray[i] == '}')
                    sstack.Pop();
                else
                    sstack.Push(schararray[i]);
            }
        }
        if (sstack.Count == 0)
            return true;
        return false;
    }

}
