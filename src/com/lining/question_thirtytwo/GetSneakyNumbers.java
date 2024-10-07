package com.lining.question_thirtytwo;

import java.util.Arrays;

/***
 * @author lining
 * @description
 * @create 2024/9/27 10:00
 * https://leetcode.cn/problems/the-two-sneaky-numbers-of-digitville/
 * 3289. 数字小镇中的捣蛋鬼
 *
 * 数字小镇 Digitville 中，存在一个数字列表 nums，其中包含从 0 到 n - 1 的整数。
 * 每个数字本应 只出现一次，然而，有 两个 顽皮的数字额外多出现了一次，使得列表变得比正常情况下更长。
 *
 * 为了恢复 Digitville 的和平，作为小镇中的名侦探，请你找出这两个顽皮的数字。
 *
 * 返回一个长度为 2 的数组，包含这两个数字（顺序任意）。
 **/
public class GetSneakyNumbers {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int[] arr = new int[2];
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                arr[index] = nums[i];
                index++;
                i++;
            }
            if (index >= arr.length) {
                break;
            }
        }
        return arr;
    }
}
