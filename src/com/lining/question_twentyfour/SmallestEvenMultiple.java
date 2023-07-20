package com.lining.question_twentyfour;

/**
 * 描述：
 * https://leetcode.cn/problems/smallest-even-multiple/
 * 2413. 最小偶倍数
 * 给你一个正整数 n ，返回 2 和 n 的最小公倍数（正整数）。
 *
 * @author lining
 * createTime 2023/7/20 8:41
 * lastModify
 * lastModifyTime
 * 小组
 * 输入：n = 5
 * 输出：10
 * 解释：5 和 2 的最小公倍数是 10 。
 *
 * 输入：n = 6
 * 输出：6
 * 解释：6 和 2 的最小公倍数是 6 。注意数字会是它自身的倍数。
 *
 * 1 <= n <= 150
 */
public class SmallestEvenMultiple {
    public int smallestEvenMultiple(int n) {
        int number;
        if (n % 2 == 1) {
            number = n * 2;
        } else {
            number = n;
        }
        return number;
    }
}
