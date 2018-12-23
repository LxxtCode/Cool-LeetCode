using System;

public class Solution
{
    /*
  * s:指定字符串
  * numRows:指定行数
  * 思路：每一行的字符用数组存储，遍历字符串，通过变量判断字符应该存储到哪一个数组中，注意问题。
 */
    public string Convert(string s, int numRows)
    {
        StringBuilder res = new StringBuilder();
        if (numRows == 1)
        {

            return s;
        }
        else
        {

            Dictionary<int, List<char>> allData = new Dictionary<int, List<char>>();
            for (int i = 0; i < numRows; i++)
            {
                allData.Add(i, new List<char>());
            }
            int strIndex = 0;
            bool gor = true;
            for (int j = 0; j < s.Length; j++)
            {
                allData[strIndex].Add(s[j]);
                if (gor)
                {
                    strIndex++;
                }
                else
                {
                    strIndex--;
                }

                if (strIndex == 0)
                {
                    gor = true;
                }
                else if (strIndex == numRows - 1)
                {
                    gor = false;
                }
            }

            for (int k = 0; k < allData.Count; k++)
            {
                string item = string.Join("", allData[k]);
                res.Append(item);
            }
        }

        return res.ToString();

    }
}
