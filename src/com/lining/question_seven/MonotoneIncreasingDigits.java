package com.lining.question_seven;

/**
 * @author lining
 * @date 2020/12/15 13:00
 */

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/monotone-increasing-digits/
 * 738. 单调递增的数字
 * 给定一个非负整数 N，找出小于或等于 N 的最大的整数，同时这个整数需要满足其各个位数上的数字是单调递增。
 * （当且仅当每个相邻位数上的数字 x 和 y 满足 x <= y 时，我们称这个整数是单调递增的。）
 * N=10 -> 9;  N=1234 -> 1234    N=332 -> 299
 */
public class MonotoneIncreasingDigits {
    public static int monotoneIncreasingDigits(int N) {
        int i = 1;
        int res = N;
        while (i <= res / 10) {
            int n = res / i % 100;
            i *= 10;
            if (n / 10 > n % 10) {
                res = res / i * i - 1;
            }
        }
        return res;
    }

    public static int again(int n) {
        char[] chars = String.valueOf(n).toCharArray();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] < chars[i - 1]) {
                chars[i-1] = (char)(chars[i-1] -1);
                for(int j = i ; j < chars.length; j++){
                    chars[j] = '9';
                }
                int i1 = Integer.parseInt(String.valueOf(chars));
                return again(i1);
            }
        }
        return Integer.parseInt(String.valueOf(chars));
    }

    public static void main(String[] args) {
        System.out.println(again(322));
    }
}
