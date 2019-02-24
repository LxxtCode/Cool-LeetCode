using System;

public class Solution
{

    /*
    * 
    * 思路：将数组元素4个一组进行组合，然后求和，留下与目标值相等的组合
    * 其他：
   */

    public IList<IList<int>> FourSum(int[] nums, int target)
    {

        IList<IList<int>> res = new List<IList<int>>();
        if (nums.Length <= 4)
        {
            int sum = 0;
            IList<int> rr = new List<int>();
            foreach (int v in nums)
            {
                sum += v;
                rr.Add(v);
            }
            if (sum == target)
            {
                res.Add(rr);
            }

        }
        else
        {
            //组合
            List<int[]> ListCombination = GetCombination(nums, 4);


            foreach (int[] v in ListCombination)
            {
                int sum = 0;
                IList<int> rr = new List<int>();
                foreach (int vv in nums)
                {
                    sum += vv;
                    rr.Add(vv);
                }
                if (sum == target)
                {
                    res.Add(rr);
                }
            }
        }
        return res;
    }

    private static void GetCombination(ref List<T[]> list, T[] t, int n, int m, int[] b, int M)
    {
        for (int i = n; i >= m; i--)
        {
            b[m - 1] = i - 1;
            if (m > 1)
            {
                GetCombination(ref list, t, i - 1, m - 1, b, M);
            }
            else
            {
                if (list == null)
                {
                    list = new List<T[]>();
                }
                T[] temp = new T[M];
                for (int j = 0; j < b.Length; j++)
                {
                    temp[j] = t[b[j]];
                }
                list.Add(temp);
            }
        }
    }

    public static List<T[]> GetCombination(T[] t, int n)
    {
        if (t.Length < n)
        {
            return null;
        }
        int[] temp = new int[n];
        List<T[]> list = new List<T[]>();
        GetCombination(ref list, t, t.Length, n, temp, n);
        return list;
    }


}
