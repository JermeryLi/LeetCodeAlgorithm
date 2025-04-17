package com.lining.question_thirthfour;

/***
 * @author lining
 * @description
 * @create 2025/4/17 21:46
 * https://leetcode.cn/problems/sum-of-variable-length-subarrays/
 * 3427. 变长子数组求和
 * 给你一个长度为 n 的整数数组 nums 。对于 每个 下标 i（0 <= i < n），定义对应的子数组 nums[start ... i]（start = max(0, i - nums[i])）。
 * 返回为数组中每个下标定义的子数组中所有元素的总和。
 * 子数组 是数组中的一个连续、非空 的元素序列。
 * 输入：nums = [2,3,1]
 * 输出：11
 * 下标 i	子数组	和
 * 0	nums[0] = [2]	2
 * 1	nums[0 ... 1] = [2, 3]	5
 * 2	nums[1 ... 2] = [3, 1]	4
 * 总和	 	11
 **/
public class SubarraySum {
    public int subarraySum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int start  = Math.max(0, i -nums[i]);
            for (int j = start; j <= i; j++) {
                sum += nums[j];
            }
        }
        return sum;
    }
}
