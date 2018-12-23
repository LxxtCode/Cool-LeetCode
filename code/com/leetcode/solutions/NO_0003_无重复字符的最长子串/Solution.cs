using System;

public class Solution
{

    /*
   * s:指定字符串
   * 思路：存储当前子字符串，并判断当前字符是否已经存在，则移除，继续下次遍历。
  */
    public int LengthOfLongestSubstring(string s)
    {
        HashSet<char> set = new HashSet<char>();
        int tar = 0, i = 0, j = 0;
        int len = s.Length;
        while (i < len && j < len)
        {
            if (!set.Contains(s[j]))
            {
                set.Add(s[j++]);
                tar = Math.Max(tar, j - i);
            }
            else
            {
                set.Remove(s[i++]);
            }
        }
        return tar;

    }

    // 效率最高的100ms
    public int LengthOfLongestSubstring(string s)
    {
        Dictionary<char, int> dic = new Dictionary<char, int>();
        int maxstart = 0; int maxend = 0; int maxLength = 0;
        int startTemp = 0;
        for (int i = 0; i < s.Length; i++)
        {
            if (!dic.ContainsKey(s[i]))
                dic.Add(s[i], i);
            else
            {
                if (dic[s[i]] >= startTemp)
                {
                    int length = i - 1 - startTemp + 1;
                    if (length > maxLength)
                    {
                        maxstart = startTemp;
                        maxend = i - 1;
                        maxLength = length;
                    }
                    startTemp = dic[s[i]] + 1;
                }
                dic[s[i]] = i;
            }
        }
        int len = s.Length - startTemp;
        if (len > maxLength)
            maxLength = len;
        return maxLength;
    }





}
