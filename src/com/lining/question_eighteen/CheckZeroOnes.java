package com.lining.question_eighteen;

/**
 * @author lining
 * @date 2021/7/21 16:32
 * 1869. 哪种连续子字符串更长
 * https://leetcode-cn.com/problems/longer-contiguous-segments-of-ones-than-zeros/
 * 给你一个二进制字符串 s 。如果字符串中由 1 组成的 最长 连续子字符串 严格长于 由 0 组成的 最长 连续子字符串，返回 true ；否则，返回 false 。
 * <p>
 * 例如，s = "110100010" 中，由 1 组成的最长连续子字符串的长度是 2 ，由 0 组成的最长连续子字符串的长度是 3 。
 * 注意，如果字符串中不存在 0 ，此时认为由 0 组成的最长连续子字符串的长度是 0 。字符串中不存在 1 的情况也适用此规则。
 */
public class CheckZeroOnes {
    public boolean checkZeroOnes(String s) {
        int oneLength = 0;
        int zeroLength = 0;
        char currentChar = s.charAt(0);
        int currentLength = 1;
        if (currentChar == '0') {
            zeroLength++;
        } else {
            oneLength++;
        }
        int length = s.length();
        for (int i = 1; i < length; i++) {
            char ch = s.charAt(i);
            if (currentChar == ch) {
                currentLength++;
            } else {
                currentChar = ch;
                currentLength = 1;
            }
            if (currentChar == '0') {
                zeroLength = Math.max(currentLength, zeroLength);
            } else {
                oneLength = Math.max(currentLength, oneLength);
            }
        }
        return oneLength > zeroLength;
    }
}
