using System;

public class Solution
{

    /*
    * 思路：遍历字符串，同时截取截取子字符串，分别于其他字符进行比较，每循环一次便减少子字符串的长度，直到满足所有字符串均包含子字符串 即跳出循环.
    * 其他：
   */

    public String longestCommonPrefix(String[] strs)
    {
        if (strs == null)
            return "";
        if (strs.Length == 0)
            return "";
        if (strs.Length == 1)
            return strs[0];
        String prefix = strs[0];
        bool isOk = false;
        int size = prefix.Length;
        int len = strs.Length;
        for (int i = 0; i <= size; i++)
        {
            prefix = prefix.Substring(0, size - i);

            for (int j = 1; j < len; j++)
            {
                if (!strs[j].StartsWith(prefix))
                {
                    isOk = false;
                    break;
                }
                else
                {
                    isOk = true;
                }
            }
            if (isOk == true)
                break;
        }
        return prefix;
    }

}
