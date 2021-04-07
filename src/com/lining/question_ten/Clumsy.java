package com.lining.question_ten;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author lining
 * @date 2021/4/1 9:11
 * https://leetcode-cn.com/problems/clumsy-factorial/
 * 1006. 笨阶乘
 * 通常，正整数 n 的阶乘是所有小于或等于 n 的正整数的乘积。例如，factorial(10) = 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1。
 * 相反，我们设计了一个笨阶乘 clumsy：在整数的递减序列中，我们以一个固定顺序的操作符序列来依次替换原有的乘法操作符：乘法(*)，除法(/)，加法(+)和减法(-)。
 * 例如，clumsy(10) = 10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1。然而，这些运算仍然使用通常的算术运算顺序：我们在任何加、减步骤之前执行所有的乘法和除法步骤，并且按从左到右处理乘法和除法步骤。
 * 另外，我们使用的除法是地板除法（floor division），所以 10 * 9 / 8 等于 11。这保证结果是一个整数。
 * 实现上面定义的笨函数：给定一个整数 N，它返回 N 的笨阶乘。
 */
public class Clumsy {
    public static int clumsy(int n) {
        int index = 0;
        int number = 0;
        int result = 0;
        int turn = 0;
        for (int i = n; i > 0; i--) {
            if (index == 0) {
                number += i;
            } else if (index == 1) {
                number *= i;
            } else if (index == 2) {
                number /= i;
            } else {
                turn++;
                result += i;
            }
            if (index != 3 && turn == 1) {
                turn += 1;
            }
            if (index == 3 || i == 1) {
                if (turn <= 1) {
                    result += number;
                } else {
                    result -= number;
                }
                index = 0;
                number = 0;
            } else {
                index++;
            }
        }
        return result;
    }

    //10 10-> 10*9
    public static int clumsy2(int n) {
        Deque<Integer> stack = new LinkedList<>();
        stack.push(n);
        n--;
        // 用于控制乘、除、加、减
        int index = 0;
        while (n > 0) {
            if (index % 4 == 0) {
                stack.push(stack.pop() * n);
            } else if (index % 4 == 1) {
                stack.push(stack.pop() / n);
            } else if (index % 4 == 2) {
                stack.push(n);
            } else {
                stack.push(-n);
            }
            index++;
            n--;
        }
        // 把栈中所有的数字依次弹出求和
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(clumsy2(10));
    }
}

//10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1
// 90/8 + 7- 30/4  + 3   -2
//11 + 7 -7 + 3 -2
//11+ 3-2
//12
//
// 18 10 2

// 5 * 4 / 3 + 2 - 1
