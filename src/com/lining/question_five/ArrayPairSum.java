package com.lining.question_five;

import java.util.Arrays;

/**
 * 描述：
 * https://leetcode.cn/problems/array-partition/
 * 561. 数组拆分
 *
 * @author lining
 * createTime 2023/5/9 18:24
 * 给定长度为 2n 的整数数组 nums ，你的任务是将这些数分成 n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从 1 到 n 的 min(ai, bi) 总和最大。
 * 返回该 最大总和
 * 小组
 */
public class ArrayPairSum {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}
