using System;

public class Solution
{

    /*
   * nums1,  nums2:指定的有序数组
   * 思路：将两个数组合并为一个数组然后排序，求出中位数即可。
   * 其他：遍历连个数组合并为一个有序新数组，遍历的同时即排好序
  */
    public double FindMedianSortedArrays(int[] nums1, int[] nums2)
    {

        double ret = 0.0;
        int[] vs = new int[nums1.Length + nums2.Length];
        nums1.CopyTo(vs, 0);
        nums2.CopyTo(vs, nums1.Length);
        Array.Sort(vs);
        int y = vs.Length % 2;
        int index = vs.Length / 2;
        if (y == 0)
        {
            var d = (decimal)(vs[index] + vs[index - 1]) / 2;
            ret = (double)d;
        }
        else
        {
            ret = vs[index];
        }
        return ret;
    }


    public double FindMedianSortedArrays2(int[] nums1, int[] nums2)
    {
        double ret = 0.0;
        int[] vs = new int[nums1.Length + nums2.Length];
        if (nums1.Length > 0 && nums2.Length > 0)
        {
            int i = 0, j = 0, k = 0;
            bool n1 = true, n2 = true;
            while (k < vs.Length)
            {
                if (n1 && n2)
                {
                    if (nums1[i] < nums2[j])
                    {
                        vs[k] = nums1[i];
                        i++;
                        if (i == nums1.Length) { n1 = false; }
                    }
                    else
                    {
                        vs[k] = nums2[j];
                        j++;
                        if (j == nums2.Length) { n2 = false; };
                    }
                }
                else
                {
                    if (n1)
                    {
                        vs[k] = nums1[i];
                        i++;
                        if (i == nums1.Length) { n1 = false; }
                    }
                    else
                    {
                        vs[k] = nums2[j];
                        j++;
                        if (j == nums2.Length) { n2 = false; };
                    }
                }

                k++;
            }
        }
        else
        {
            if (nums1.Length == 0)
            {
                nums2.CopyTo(vs, 0);
            }
            else
            {
                nums1.CopyTo(vs, 0);
            }
        }
        int y = vs.Length % 2;
        int index = vs.Length / 2;
        if (y == 0)
        {
            var d = (decimal)(vs[index] + vs[index - 1]) / 2;
            ret = (double)d;
        }
        else
        {
            ret = vs[index];
        }
        return ret;



    }










}
