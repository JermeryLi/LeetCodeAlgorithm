package com.lining.question_three;

import java.util.Arrays;

/**
 * @author lining
 * @date 2020/12/18 8:53
 * https://leetcode-cn.com/problems/find-the-difference/
 * 389. 找不同
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 * 请找出在 t 中被添加的字母。
 * 0 <= s.length <= 1000
 */
public class FindTheDifference {
    public static char findTheDifference(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        for (int i = 0; i < sChars.length; i++) {
            if (sChars[i] != tChars[i]) {
                return tChars[i];
            }
        }
        return tChars[tChars.length - 1];
    }

    //ASCII编码 求和 小写字母最大的值 z 122 * 1000 不会溢出
    public static char findTheDifference2(String s, String t) {
        int sSum = 0;
        int tSum = t.charAt(s.length());
        for (int i = 0; i < s.length(); i++) {
            sSum += s.charAt(i);
            tSum += t.charAt(i);
        }
        return (char) (tSum - sSum);
    }


}
