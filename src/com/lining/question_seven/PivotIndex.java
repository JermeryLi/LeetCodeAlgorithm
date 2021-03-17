package com.lining.question_seven;

import java.util.Arrays;

/**
 * @author lining
 * @date 2021/1/28 13:52
 * 724. 寻找数组的中心索引
 * https://leetcode-cn.com/problems/find-pivot-index/
 * 给定一个整数类型的数组 nums，请编写一个能够返回数组 “中心索引” 的方法。
 * 我们是这样定义数组 中心索引 的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。
 * 如果数组不存在中心索引，那么我们应该返回 -1。如果数组有多个中心索引，那么我们应该返回最靠近左边的那一个。
 */
public class PivotIndex {
    public static int pivotIndex(int[] nums) {
        int length = nums.length;
        int sum = Arrays.stream(nums).sum();
        int sumLeft = 0;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sumLeft += nums[i - 1];
            }
            if (sumLeft == (sum - sumLeft - nums[i])) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1, -1, -1, 0, 1, 1};
        System.out.println(pivotIndex(nums));
    }

    //[1,3,5,6]  7
    public int searchInsert(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (target <= nums[i]) {
                return i;
            }
        }
        return length;
    }
}
