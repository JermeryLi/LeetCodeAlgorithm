package com.lining.question_thirtyfive;

/***
 * @author lining
 * @description
 * @create 2025/4/17 21:30
 * https://leetcode.cn/problems/minimum-operations-to-make-array-sum-divisible-by-k/
 * 3512. 使数组和能被 K 整除的最少操作次数
 * 给你一个整数数组 nums 和一个整数 k。你可以执行以下操作任意次：
 *
 * 选择一个下标 i，并将 nums[i] 替换为 nums[i] - 1。
 * 返回使数组元素之和能被 k 整除所需的最小操作次数。
 *
 * 输入： nums = [3,9,7], k = 5
 * 输出： 4
 * 解释：
 * 对 nums[1] = 9 执行 4 次操作。现在 nums = [3, 5, 7]。
 * 数组之和为 15，可以被 5 整除。
 **/
public class MinOperations {
    public int minOperations(int[] nums, int k) {
        int length = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum % k;
    }
}
