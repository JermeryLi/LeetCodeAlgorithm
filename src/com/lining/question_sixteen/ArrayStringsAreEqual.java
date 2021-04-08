package com.lining.question_sixteen;

/**
 * @author lining
 * @date 2021/4/8 9:43
 * 1662. 检查两个字符串数组是否相等
 * https://leetcode-cn.com/problems/check-if-two-string-arrays-are-equivalent/
 * 给你两个字符串数组 word1 和 word2 。如果两个数组表示的字符串相同，返回 true ；否则，返回 false 。
 * 数组表示的字符串 是由数组中的所有元素 按顺序 连接形成的字符串。
 * 输入：word1 = ["ab", "c"], word2 = ["a", "bc"]
 * 输出：true
 * 解释：
 * word1 表示的字符串为 "ab" + "c" -> "abc"
 * word2 表示的字符串为 "a" + "bc" -> "abc"
 * 两个字符串相同，返回 true
 */
public class ArrayStringsAreEqual {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        for (String value : word1) {
            sb1.append(value);
        }
        for (String s : word2) {
            sb2.append(s);
        }
        return sb1.toString().equals(sb2.toString());
    }
}
