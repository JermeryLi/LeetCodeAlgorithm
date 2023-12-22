package com.lining.question_twentyfive;

/**
 * @author lining
 * @Time 2023/12/12 13:05
 * 2520. 统计能整除数字的位数
 * 给你一个整数 num ，返回 num 中能整除 num 的数位的数目。
 * <p>
 * 如果满足 nums % val == 0 ，则认为整数 val 可以整除 nums 。
 * https://leetcode.cn/problems/count-the-digits-that-divide-a-number/
 */
public class CountDigits {
    public int countDigits(int num) {
        String str = String.valueOf(num);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            int number = str.charAt(i) - 48;
            if (num % number == 0) {
                count++;
            }
        }
        return count;
    }
}
