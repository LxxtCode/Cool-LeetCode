using System;

public class Solution
{

    /*
    * nums:指定数组
    * 暴力法：将元素进行组合，判断和是否等于零
    *
    */
    public IList<IList<int>> ThreeSum(int[] nums)
    {
        ISet<IList<int>> tar = new HashSet<IList<int>>();
        for (int i = 0; i < nums.Length; i++)
        {
            for (int j = i + 1; i < nums.Length-1; j++)
            {
                for (int k = j + 1; i < nums.Length-2; k++)
                {
                    if (nums[i] + nums[j] + nums[k] == 0)
                    {
                        IList<int> item = new List<int>();
                        item.Add(nums[i]);
                        item.Add(nums[j]);
                        item.Add(nums[k]);
                        tar.Add(item);
                    }
                }
            }

        }
        IList<IList<int>> target = new List<IList<int>>();
        foreach (var v in tar)
        {
            target.Add(v);
        }
        return target;
    }
}
