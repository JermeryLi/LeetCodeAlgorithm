package com.lining.question_six;

import java.util.Arrays;

/**
 * @author lining
 * @date 2021/1/20 16:33
 * 628. 三个数的最大乘积
 * https://leetcode-cn.com/problems/maximum-product-of-three-numbers/
 */
public class MaximumProduct {
    public static int maximumProduct(int[] nums) {
        int length = nums.length;
        if (length == 3) {
            return nums[0] * nums[1] * nums[2];
        }
        Arrays.sort(nums);
        int num1 = nums[length - 1];
        int num2 = nums[length - 2];
        int num3 = nums[length - 3];
        int num4 = nums[0];
        int num5 = nums[1];
        int i = num1 * num4 * num5;
        int i1 = num1 * num2 * num3;
        return Math.max(i1, i);
    }
}
