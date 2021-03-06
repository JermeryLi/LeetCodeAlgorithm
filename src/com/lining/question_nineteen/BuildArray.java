package com.lining.question_nineteen;

/**
 * @author lining
 * @date 2021/7/20 15:07
 * 1920. 基于排列构建数组
 * 给你一个 从 0 开始的排列 nums（下标也从 0 开始）。请你构建一个 同样长度 的数组 ans ，
 * 其中，对于每个 i（0 <= i < nums.length），都满足 ans[i] = nums[nums[i]] 。返回构建好的数组 ans 。
 * 从 0 开始的排列 nums 是一个由 0 到 nums.length - 1（0 和 nums.length - 1 也包含在内）的不同整数组成的数组。
 */
public class BuildArray {
    public int[] buildArray(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length];
        for (int i = 0; i < length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
