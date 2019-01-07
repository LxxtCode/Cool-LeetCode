using System;

public class Solution
{

    /*
   * str:指定字符串
   * 思路：遍历字符串进行判断，最后转换为整型时注意边界问题。
   * 
  */
    public int MyAtoi(string str)
    {
        str = str.Trim();
        if (str.Length == 0) { return 0; }
        int re = 0;
        bool f = true;
        char f0 = str[0];
        try
        {
            if (!f0.ToString().Equals("+") && !f0.ToString().Equals("-")) { int b = int.Parse(f0.ToString()); }

        }
        catch (Exception)
        {
            f = false;
        }
        if (!f) return 0;
        StringBuilder res = new StringBuilder();

        int index = 0;
        foreach (char v in str)
        {
            bool thischar = true;
            if (index == 0 && (v.ToString().Equals("+") || v.ToString().Equals("-")))
            {
                if (v.Equals('-')) { res.Append(v); }
                index++;
                continue;
            }
            try
            {
                int reyy = Convert.ToInt32(v.ToString());
                res.Append(v);
            }
            catch (Exception e)
            {
                thischar = false;
            }
            if (!thischar) { break; }
            index++;
        }
        if (res.ToString().Length > 0 && "0".Equals(res.ToString()[0].ToString())) { res = res.Remove(0, 1); }
        try
        {
            re = Convert.ToInt32(res.ToString());
        }
        catch (OverflowException)
        {
            if ("-".Equals(res.ToString()[0].ToString()))
            {
                re = int.MinValue;
            }
            else { re = int.MaxValue; }

        }
        catch (Exception e) { re = 0; }
        return re;
    }
}
