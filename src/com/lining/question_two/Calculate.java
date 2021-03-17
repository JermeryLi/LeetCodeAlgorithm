package com.lining.question_two;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author lining
 * @date 2021/3/10 9:28
 * https://leetcode-cn.com/problems/basic-calculator/
 * 224. 基本计算器
 * s 由数字、'+'、'-'、'('、')'、和 ' ' 组成
 */
public class Calculate {
    //思路 遍历s 拆括号

    public int calculate(String s) {
        Deque<Integer> ops = new LinkedList<Integer>();
        ops.push(1);
        int sign = 1;

        int ret = 0;
        int n = s.length();
        int i = 0;
        while (i < n) {
            if (s.charAt(i) == ' ') {
                i++;
            } else if (s.charAt(i) == '+') {
                sign = ops.peek();
                i++;
            } else if (s.charAt(i) == '-') {
                sign = -ops.peek();
                i++;
            } else if (s.charAt(i) == '(') {
                ops.push(sign);
                i++;
            } else if (s.charAt(i) == ')') {
                ops.pop();
                i++;
            } else {
                long num = 0;
                while (i < n && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + s.charAt(i) - '0';
                    i++;
                }
                ret += sign * num;
            }
        }
        return ret;
    }


}
