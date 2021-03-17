package com.lining.question_ten;

/**
 * @author lining
 * @date 2021/3/9 14:50
 * https://leetcode-cn.com/problems/remove-all-adjacent-duplicates-in-string/
 * 1047. 删除字符串中的所有相邻重复项
 * 给出由小写字母组成的字符串 S，重复项删除操作会选择两个相邻且相同的字母，并删除它们。
 * 在 S 上反复执行重复项删除操作，直到无法继续删除。
 * 在完成所有重复项删除操作后返回最终的字符串。答案保证唯一。
 */
public class RemoveDuplicates {
    public String removeDuplicates(String str) {
        StringBuilder stack = new StringBuilder();
        int top = -1;
        for (int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);
            if (top >= 0 && stack.charAt(top) == ch) {
                stack.deleteCharAt(top);
                --top;
            } else {
                stack.append(ch);
                ++top;
            }
        }
        return stack.toString();
    }
}
