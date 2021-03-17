package com.lining.question_zero;

/**
 *https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
 * 剑指 Offer 58 - II
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 * s = "abcdefg", k = 2  cdefgab
 * s = "lrloseumgh", k = 6 umghlrlose
 */

/**
 * @author lining
 * @date 2020/12/15 14:24
 */
public class ReverseLeftWords {
    public static String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }


}
