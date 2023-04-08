package com.lining.question_zero;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 13034
 * https://leetcode.cn/problems/roman-to-integer/
 * 13. 罗马数字转整数
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * <p>
 * 输入: s = "III"
 * 输出: 3
 * <p>
 * 输入: s = "IV"
 * 输出: 4
 * <p>
 * 输入: s = "IX"
 * 输出: 9
 * <p>
 * 输入: s = "LVIII"
 * 输出: 58
 * 解释: L = 50, V= 5, III = 3.
 * <p>
 * 输入: s = "MCMXCIV"
 * 输出: 1994
 * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
 */
public class RomanToInt {
    public int romanToInt(String s) {
        int sum = 0;
        int preNum = getValue(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int num = getValue(s.charAt(i));
            if (preNum < num) {
                sum -= preNum;
            } else {
                sum += preNum;
            }
            preNum = num;
        }
        sum += preNum;
        return sum;
    }

    private int getValue(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        RomanToInt romanToInt = new RomanToInt();
        romanToInt.romanToInt("III");
    }
}
