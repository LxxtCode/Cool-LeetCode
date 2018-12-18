using System;

public class Solution
{

    /*
    * x:指定整数
    * 思路：将整数转换为字符串进行遍历交换然换再转换为整数,注意异常处理。
   */
    public int Reverse(int x)
    {
        StringBuilder target = new StringBuilder();
        string b = x.ToString();
        int re = 0;
        if (x < 0)
        {
            target.Append("-");
            b = b.Substring(1, b.Length - 1);
        }
        for (int i = b.Length - 1; i >= 0; i--)
        {
            target.Append(b[i]);
        }
        try
        {
            re = Convert.ToInt32(target.ToString());

        }
        catch (Exception e)
        {
            return re;
        }
        return re;
    }
}
