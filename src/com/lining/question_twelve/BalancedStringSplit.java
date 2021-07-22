package com.lining.question_twelve;

/**
 * @author lining
 * @date 2021/7/21 17:16
 * 1221. 分割平衡字符串
 * https://leetcode-cn.com/problems/split-a-string-in-balanced-strings/
 * 在一个 平衡字符串 中，'L' 和 'R' 字符的数量是相同的。
 * 给你一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。
 * 注意：分割得到的每个字符串都必须是平衡字符串。
 * 返回可以通过分割得到的平衡字符串的 最大数量 。
 */
public class BalancedStringSplit {
    public int balancedStringSplit(String s) {
        int length = s.length();
        int count = 0;
        int lLength = 0;
        int rLength = 0;
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c == 'L') {
                lLength++;
            } else {
                rLength++;
            }
            if (lLength == rLength) {
                count++;
                rLength = lLength = 0;
            }
        }
        return count;
    }
}
