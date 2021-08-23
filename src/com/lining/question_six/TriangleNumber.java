package com.lining.question_six;

import java.util.Arrays;

/**
 * @author lining
 * @date 2021/8/4 9:18
 * 611. 有效三角形的个数
 * https://leetcode-cn.com/problems/valid-triangle-number/
 * 给定一个包含非负整数的数组，你的任务是统计其中可以组成三角形三条边的三元组个数。
 */
public class TriangleNumber {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int length = nums.length;
        for (int i = 0; i < length - 2; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                int one = nums[i];
                int two = nums[j];
                int max = one + two - 1;
                for (int k = j + 1; k < length; k++) {
                    if (nums[k] <= max) {
                        count++;
                    } else {
                        break;
                    }
                }
            }
        }
        return count;
    }
}
