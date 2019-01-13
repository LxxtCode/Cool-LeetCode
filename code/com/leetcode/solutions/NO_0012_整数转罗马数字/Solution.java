package com.leetcode.solutions.NO_0012_整数转罗马数字;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by gang.xu01@hand-china.com on 2019/1/13
 */
public class Solution {


    private final LinkedHashMap<Integer, String> format = new LinkedHashMap<Integer, String>(){{
        put(1000, "M");
        put(900, "CM");
        put(500, "D");
        put(400, "CD");
        put(100, "C");
        put(90, "XC");
        put(50, "L");
        put(40, "XL");
        put(10, "X");
        put(9, "IX");
        put(5, "V");
        put(4, "IV");
        put(1, "I");
    }};

    /**
     * 解法：一层一层遍历得到对应的罗马数字即可
     *
     * @param num
     * @return
     */
    public String intToRoman(int num) {
        if (num < 1 || num > 3999) throw new RuntimeException("Not in range");

        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new HashMap<String, Integer>(){{
            put("value", num);
        }};

        format.forEach( (k, v) -> {
            int n = map.get("value");
            int t = n / k;
            if (t > 0) {
                map.put("value", n % k);
                for (int i = 0; i < t; i++) sb.append(v);
            }
        });

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().intToRoman(1994));
//        System.out.println( 994 % 900);
    }

}
