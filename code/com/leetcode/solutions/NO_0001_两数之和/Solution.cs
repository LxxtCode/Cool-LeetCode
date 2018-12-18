using System;

public class Solution
{
    /*
    * nums:指定数组
    * target：目标值
    * 思路：Dictionary<int, int> 存储数组遍历的值和索引。当数组值与Dictionary中的value相加等一目标值是结束。
   */
    public int[] TwoSum(int[] nums, int target)
    {
        Dictionary<int, int> present = new Dictionary<int, int>();
        int[] tar = new int[2];
        for (int i = 0; i < nums.Length; i++)
        {
            foreach (var v in present)
            {
                int y = v.Value;
                if (target == (y + nums[i]))
                {
                    tar[0] = i;
                    tar[1] = v.Key;
                    Array.Sort(tar);
                    return tar;
                }
            }
            present.Add(i, nums[i]);
        }
        return tar;
    }

    // 最高效率200多毫秒
    public int[] TwoSums(int[] nums, int target)
    {
        Dictionary<int, int> contain = new Dictionary<int, int>();
        for (int i = 0; i < nums.Length; i++)
        {
            if (contain.ContainsKey(target - nums[i])) return new int[] { contain[target - nums[i]], i };

            else if (!contain.ContainsKey(nums[i])) contain.Add(nums[i], i);
        }
        return new int[] { 0, 0 };
    }
}
