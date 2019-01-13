using System;

public class Solution
{
    /*
    * s:指定字符串 p 匹配表达式
    * IsMatch() 指示所指定的正则表达式在指定的输入字符串中是否找到了匹配项
    *
    */
    public bool isMatch(string s,string p)
    {
        string valEx = "@" + p;
        if (Regex.IsMatch(s.Trim(), valEx)) return true;
        else return false;
    }
}
