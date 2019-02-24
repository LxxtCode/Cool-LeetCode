using System;

public class Solution
{

    /*
    * s:指定罗马数字
    * 思路：将罗马数字拆分 得到对应的阿拉伯数字然后相加
    * 其他：
   */

    public int RomanToInt(string s)
    {
        Dictionary<string, int> keyValues = new Dictionary<string, int>();
        keyValues.Add("I", 1);
        keyValues.Add("V", 5);
        keyValues.Add("X", 10);
        keyValues.Add("L", 50);
        keyValues.Add("C", 100);
        keyValues.Add("D", 500);
        keyValues.Add("M", 1000);

        keyValues.Add("IV", 4);
        keyValues.Add("IX", 9);
        keyValues.Add("XL", 40);
        keyValues.Add("XC", 90);
        keyValues.Add("CD", 400);
        keyValues.Add("CM", 900);

        List<int> arr = new List<int>();
        foreach (char v in s)
        {
            foreach (var item in keyValues)
            {
                if (v.ToString().Equals(item.Key)) { arr.Add(item.Value); }
            }

        }
        int res = 0;
        foreach (var v in arr)
        {
            res += v;
        }
        return res;
    }

}
