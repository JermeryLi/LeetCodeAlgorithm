package com.lining.question_eleven;

/**
 * 描述：
 * 1137. 第 N 个泰波那契数
 * https://leetcode.cn/problems/n-th-tribonacci-number/
 * 泰波那契序列 Tn 定义如下： 
 *
 * T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0 的条件下 Tn+3 = Tn + Tn+1 + Tn+2
 * 给你整数 n，请返回第 n 个泰波那契数 Tn 的值。
 *
 * 输入：n = 4
 * 输出：4
 * 解释：
 * T_3 = 0 + 1 + 1 = 2
 * T_4 = 1 + 1 + 2 = 4
 *
 * @author lining
 * createTime 2023/4/8 14:31
 * lastModify
 * lastModifyTime
 * 小组
 */
public class Tribonacci {
    public int tribonacci(int n) {
        int value = 0;
        if (n == 0) {
        } else if (n == 1 || n == 2) {
            value = 1;
        } else {
            int first = 0;
            int second = 1;
            int third = 1;
            for (int i = 3; i <= n; i++) {
                value = first + second + third;
                first = second;
                second = third;
                third = value;
            }
        }
        return value;
    }

    public static void main(String[] args) {
        Tribonacci tribonacci = new Tribonacci();
        System.out.println(tribonacci.tribonacci(4));
    }

}
