package com.lining.question_six;

/**
 * @author lining
 * @date 2021/4/28 14:44
 * 633. 平方数之和
 * https://leetcode-cn.com/problems/sum-of-square-numbers/
 * 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c 。
 */
public class JudgeSquareSum {
    public boolean judgeSquareSum(int c) {
        for (long a = 0; a * a <= c; a++) {
            double b = Math.sqrt(c - a * a);
            if (b == (int) b) {
                return true;
            }
        }
        return false;
    }
}
