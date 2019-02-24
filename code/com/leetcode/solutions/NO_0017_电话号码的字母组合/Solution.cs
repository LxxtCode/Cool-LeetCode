using System;

public class Solution
{

    /*
    * 思路：通过映射map的到所有的字母组合的List，然后对所有组合中的字符进行组合，同时存入List中，输出即可
    * 其他：
   */

    public IList<string> LetterCombinations(string digits)
    {
        Dictionary<string, string> func = new Dictionary<string, string>();
        func.Add("2", "abc");
        func.Add("3", "def");
        func.Add("4", "ghi");
        func.Add("5", "jkl");
        func.Add("6", "mno");
        func.Add("7", "pqrs");
        func.Add("8", "tuv");
        func.Add("9", "wxyz");
        IList<string> res = new List<string>();

        List<string> rt = new List<string>();
        digits = digits.Replace("1", "");
        foreach (Char v in digits)
        {
            rt.Add(func[v.ToString()]);
        }
        int index = 0;

        for (int i = 1; i < rt.Count; i++)
        {
            if (index == rt.Count - 1) break;
            string source = rt[index];
            foreach (Char item in source)
            {
                for (int k = index; i < rt.Count; k++)
                {
                    foreach (Char vv in rt[k])
                    {
                        res.Add((vv + item).ToString());
                    }
                }
            }
            index++;

        }
        return res;
    }

}
