using System;

public class Solution
{

    /*
    * 思路：首先遍历字符串 找到每一组对称中中心 然后向两边遍历 相等则继续扩大字符串长度，同时记录字符遍历初始和结束位置 ，最后截取该连段位置的
    * 字符即可
    * 其他：
   */

    public String longestPalindrome(string s)
    {
        int len = s.Length;
        if (len <= 0) { return ""; }
        bool[,] isPalindrome = new bool[,] { };
        isPalindrome[0, 0] = true;
        int max = 0, startnow = 0, endnow = 0;
        for (int i = 1; i < len; i++)
        {
            isPalindrome[i, i] = true;
            if (s[i] == s[i - 1])
            {
                max = 1;
                startnow = i - 1;
                endnow = i;
                isPalindrome[i - 1, i] = true;
            }
        }

        for (int i = 2; i < len; i++)
        {
            if (max + 2 >= i)
            {
                for (int start = 0; start < len - i; start++)
                {
                    int end = start + i;
                    if (isPalindrome[start + 1, end - 1] && (s[start] == s[end]))
                    {
                        max = i;
                        startnow = start;
                        endnow = end;
                        isPalindrome[start, end] = true;
                    }
                }
            }
            else
            {
                break;
            }
        }

        return s.Substring(startnow, endnow + 1);
    }

}
