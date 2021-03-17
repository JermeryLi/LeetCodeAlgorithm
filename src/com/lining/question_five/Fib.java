package com.lining.question_five;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author lining
 * @date 2021/1/4 11:24
 * https://leetcode-cn.com/problems/fibonacci-number/
 * 斐波那契数，通常用 F(n) 表示，形成的序列称为 斐波那契数列 。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
 * <p>
 * F(0) = 0，F(1) = 1
 * F(n) = F(n - 1) + F(n - 2)，其中 n > 1
 * 给你 n ，请计算 F(n) 。
 */
public class Fib {
    private static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    private static int fib2(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int a = 1;
        int b = 0;
        for (int i = 2; i <= n; i++) {
            int temp = a;
            a = a + b;
            b = temp;
        }
        return a;
    }

}
