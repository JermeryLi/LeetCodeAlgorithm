package com.lining.question_eighteen;

/**
 * @author lining
 * @date 2021/4/16 9:25
 * https://leetcode-cn.com/problems/sign-of-the-product-of-an-array/
 * 1822. 数组元素积的符号
 * 已知函数 signFunc(x) 将会根据 x 的正负返回特定值：
 * 如果 x 是正数，返回 1 。
 * 如果 x 是负数，返回 -1 。
 * 如果 x 是等于 0 ，返回 0 。
 * 给你一个整数数组 nums 。令 product 为数组 nums 中所有元素值的乘积。
 * 返回 signFunc(product) 。
 */
public class ArraySign {
    public int arraySign(int[] nums) {
        //记录负数的个数
        int count = 0;
        for (int num : nums) {
            if (num == 0) {
                return 0;
            }
            if (num < 0) {
                count++;
            }
        }
        return count % 2 == 0 ? 1 : -1;
    }
}
