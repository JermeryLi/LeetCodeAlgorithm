package com.lining.question_nineteen;

/**
 * @author lining
 * @date 2021/7/20 15:11
 * https://leetcode-cn.com/problems/concatenation-of-array/
 * 1929. 数组串联
 * 给你一个长度为 n 的整数数组 nums 。
 * 请你构建一个长度为 2n 的答案数组 ans ，数组下标 从 0 开始计数 ，
 * 对于所有 0 <= i < n 的 i ，满足下述所有要求：
 * ans[i] == nums[i]
 * ans[i + n] == nums[i]
 * 具体而言，ans 由两个 nums 数组 串联 形成。
 * 返回数组 ans 。
 */
public class GetConcatenation {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] ans = new int[2 * length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + length] = nums[i];
        }
        return ans;
    }
}
