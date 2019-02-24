using System;

public class Solution
{

    /*
    * 思路：将给定数组 3个进行组合，然后求和与目标值进行对比 留下最接近的一个
    * 其他：
   */

    public int ThreeSumClosest(int[] nums, int target)
    {
        List<int[]> ListCombination = GetCombination(nums, 3);
        List<int> sumList = new List<int>();

        foreach (int[] v in ListCombination)
        {

            int sum = 0;
            IList<int> rr = new List<int>();
            foreach (int vv in nums)
            {
                sum += vv;
            }
            sumList.Add(sum);
        }
        int f = 0;
        foreach (int bv in sumList)
        {
            if (target - bv == 0) {
                f = bv;
            }
            if (target - bv > 0) {
                if (target - bv <= f) {
                    f = target - bv;
                }
            } else {
                if ((-(target - bv)) <= f)
                {
                    f = target - bv;
                }
            }
        }
        return f;
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
