using System;

public class Solution
{
	
    /*
    * num:指定数字
    * 思路：分别求出各个位上的数字，然后进行判断。
    * 其他：将罗马数字分别定义为四个数组，然后得到位数之后对应去取。
   */

        public string IntToRoman(int num)
        {
            //千位
            int s = num / 1000;
            int t = (num % 1000) / 100;
            int v = ((num % 1000) % 100) / 10;
            int k = ((num % 1000) % 100) % 10;
            int[] arr = { s, t, v, k };
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < arr.Length; i++)
            {
                int item = arr[i];
                switch (i)
                {
                    case 0:
                        // 千位
                        if (item > 0)
                        {
                            for (int j = 0; j < item; j++)
                            { res.Append("M"); }
                        }
                        break;
                    case 1:
                        //百位
                        if (item > 0 && item < 4)
                        {
                            for (int j = 0; j < item; j++)
                            { res.Append("C"); }
                        }
                        else if (item == 4)
                        {
                            res.Append("CD");
                        }
                        else if (item == 5)
                        {
                            res.Append("D");
                        }
                        else if (item > 5 && item < 9)
                        {
                            res.Append("D");
                            for (int j = 0; j < item - 5; j++)
                            { res.Append("C"); }
                        }
                        else if (item == 9)
                        {
                            res.Append("CM");
                        }
                        break;
                    case 2:
                        // 十位
                        if (item > 0 && item < 4)
                        {
                            for (int j = 0; j < item; j++)
                            { res.Append("X"); }
                        }
                        else if (item == 4)
                        {
                            res.Append("XL");
                        }
                        else if (item == 5)
                        {
                            res.Append("L");
                        }
                        else if (item > 5 && item < 9)
                        {
                            res.Append("L");
                            for (int j = 0; j < item - 5; j++)
                            { res.Append("X"); }
                        }
                        else if (item == 9)
                        {
                            res.Append("XC");
                        }
                        break;

                    case 3:
                        if (item > 0 && item < 4)
                        {
                            for (int j = 0; j < item; j++)
                            { res.Append("I"); }
                        }
                        else if (item == 4)
                        {
                            res.Append("IV");
                        }
                        else if (item == 5)
                        {
                            res.Append("V");
                        }
                        else if (item > 5 && item < 9)
                        {
                            res.Append("V");
                            for (int j = 0; j < item - 5; j++)
                            { res.Append("I"); }
                        }
                        else if (item == 9)
                        {
                            res.Append("IX");
                        }
                        break;
                }
            }
            return res.ToString();
        }
  
}
