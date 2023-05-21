package com.lining.question_zero;

/**
 * 描述：
 *
 * @author lining
 * createTime 2023/5/21 15:11
 * https://leetcode.cn/problems/valid-parentheses/
 * 20. 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 每个右括号都有一个对应的相同类型的左括号。
 */
public class IsValid {
    public boolean isValid(String s) {
        String a = "()";
        String b = "{}";
        String c = "[]";
        while (s.contains(a) || s.contains(b) || s.contains(c)) {
            s = s.replace(a, "");
            s = s.replace(b, "");
            s = s.replace(c, "");
        }
        return s.length() == 0;
    }
}
