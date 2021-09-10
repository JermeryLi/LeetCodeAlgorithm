package com.lining.question_fifteen;

/**
 * @author lining
 * @date 2021/9/7 10:35
 * 1528. 重新排列字符串
 * https://leetcode-cn.com/problems/shuffle-string/
 * 给你一个字符串 s 和一个 长度相同 的整数数组 indices 。
 * 请你重新排列字符串 s ，其中第 i 个字符需要移动到 indices[i] 指示的位置。
 * 返回重新排列后的字符串。
 */
public class RestoreString {
    public String restoreString(String s, int[] indices) {
        int length = indices.length;
        char[] cha = new char[length];
        for (int i = 0; i < length; i++) {
            int index = indices[i];
            char c = s.charAt(i);
            cha[index] = c;
        }
        return String.valueOf(cha);
    }
}
