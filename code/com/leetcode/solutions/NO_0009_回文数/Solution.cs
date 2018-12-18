using System;

public class Solution
{
    /*
    * x:指定整数
    * 思路：将整数转换为字符串，将字符串拆分为两部分之后进行比较。
    *
    */
    public bool IsPalindrome(int x)
    {
        bool r = true;
        string a = x.ToString();
        if (a.Length == 1)
        {
            return true;
        }
        else if (x < 0)
        {
            return true;
        }
        else
        {
            if (a.Length % 2 == 0)
            {
                // 偶数
                string f = a.Substring(0, a.Length / 2);
                string l = a.Substring(a.Length / 2, a.Length / 2);
                for (int i = 0; i < f.Length; i++)
                {
                    if (!f[i].Equals(l[f.Length - 1 - i]))
                    {
                        r = false;
                    }
                }
            }
            else
            {
                //奇数
                string f = a.Substring(0, a.Length / 2);
                string l = a.Substring(a.Length / 2 + 1, a.Length / 2);
                for (int i = 0; i < f.Length; i++)
                {
                    if (!f[i].Equals(l[f.Length - 1 - i]))
                    {
                        r = false;
                    }
                }

            }
        }
        return r;
    }

    // 执行时间最短96毫秒
    public bool IsPalindromes(int x)
    {
        if (x < 0)
            return false;
        int sum = 0;
        int target = x;
        while (x / 10 != 0)
        {
            sum = sum * 10 + x % 10;
            x = x / 10;
        }
        sum = sum * 10 + x % 10;
        if (sum == target)
            return true;
        else
            return false;
    }
}
