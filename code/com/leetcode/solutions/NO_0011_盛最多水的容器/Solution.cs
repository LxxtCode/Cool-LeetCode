using System;

public class Solution
{

    /*
    * nums:指定数组
    * 暴力法：将元素进行组合，判断和是否等于零
    *
    */
    public int MaxArea(int[] height)
    {
        int max = 0;
        int index = 0;
        while (index < height.Length)
        {
            int k = 1;
            for (int i = index; i + 1 < height.Length; i++)
            {

                if (height[index] > height[i + 1])
                {
                    if (height[i + 1] * k > max)
                    {
                        max = height[i + 1] * k;
                    }

                }
                else
                {
                    if (height[index] * k > max)
                    {
                        max = height[index] * k;
                    }
                }
                k++;
            }
            index++;
        }
        return max;

    }

      // 两端向中间开始计算
        public int MaxArea(int[] height)
        {
            int len = height.Length;
            int l = 0;
            int r = len - 1;
            int MaxArea = 0;
            while (l < r)
            {
                int temp = (r - l) * Math.Min(height[r], height[l]);
                MaxArea = MaxArea > temp ? MaxArea : temp;
                if (height[l] > height[r]) --r;
                else ++l;
            }
            return MaxArea;
        }
    
}
