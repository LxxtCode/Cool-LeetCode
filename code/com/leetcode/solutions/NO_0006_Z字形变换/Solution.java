package com.leetcode.solutions.NO_0006_Z字形变换;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gang.xu01@hand-china.com on 2018/12/27
 */
public class Solution {

    /**
     * 解法：行的思想，按照行把所有值塞到list里面，在一次遍历数组的时候，标注遍历方向，按照方向和顺序塞入到各自的list当中
     *      最后输出list即可
     *
     * @param s 输入字符串
     * @param numRows 显示多少行
     * @return
     */
    public String convert(String s, int numRows) {

        if (numRows <= 0) throw new RuntimeException("error");
        else if (numRows == 1) return s;

        StringBuilder returnStr = new StringBuilder();
        List<StringBuffer> sbList = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
            sbList.add(new StringBuffer());
        }

        boolean down = false;
        int row = 0;
        for (char c : s.toCharArray()) {
            sbList.get(row).append(c);
            if(row == 0 || row == numRows - 1) down = !down;
            if(down) row++; else row--;
        }

        for (StringBuffer sb : sbList) {
            returnStr.append(sb);
        }

        return returnStr.toString();
    }


    public static void main(String[] args) {

    }

}
