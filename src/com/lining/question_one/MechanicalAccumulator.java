package com.lining.question_one;

/**
 * @author lining
 * @Time 2023/12/7 8:48
 * LCR 189. 设计机械累加器
 * https://leetcode.cn/problems/qiu-12n-lcof/description/
 * 请设计一个机械累加器，计算从 1、2... 一直累加到目标数值 target 的总和。
 * 注意这是一个只能进行加法操作的程序，不具备乘除、if-else、switch-case、for 循环、while 循环，及条件判断语句等高级功能。
 * 加减法、赋值、位运算符以及逻辑运算符。
 */
public class MechanicalAccumulator {
    public int mechanicalAccumulator(int target) {
        boolean flag = target > 0 && (target += mechanicalAccumulator(target - 1)) > 0;
        return target;
    }
}
