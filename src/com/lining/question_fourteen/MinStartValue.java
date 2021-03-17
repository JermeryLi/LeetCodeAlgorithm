package com.lining.question_fourteen;

/**
 * @author lining
 * @date 2021/1/5 10:03
 * https://leetcode-cn.com/problems/minimum-value-to-get-positive-step-by-step-sum/
 * 1413. 逐步求和得到正数的最小值
 * 给你一个整数数组 nums 。你可以选定任意的 正数 startValue 作为初始值。
 * 你需要从左到右遍历 nums 数组，并将 startValue 依次累加上 nums 数组中的值。
 * 请你在确保累加和始终大于等于 1 的前提下，选出一个最小的 正数 作为 startValue 。
 */
public class MinStartValue {
    public int minStartValue(int[] nums) {
        int num = 1;
        int min = num + nums[0];
        int sum = 0;
        for (int value : nums) {
            sum += value;
            if (sum < min) {
                min = sum;
            }
        }
        if (min < 1) {
            num = 1 - min;
        }
        return num;
    }
}
