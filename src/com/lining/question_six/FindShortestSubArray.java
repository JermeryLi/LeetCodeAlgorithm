package com.lining.question_six;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lining
 * @date 2021/2/20 9:39
 * https://leetcode-cn.com/problems/degree-of-an-array/
 * 697. 数组的度
 * 给定一个非空且只包含非负数的整数数组 nums，数组的度的定义是指数组里任一元素出现频数的最大值。
 * 你的任务是在 nums 中找到与 nums 拥有相同大小的度的最短连续子数组，返回其长度。
 */
public class FindShortestSubArray {
    public int findShortestSubArray(int[] nums) {
        //数组长度为3 分别记录出现次数、始坐标、终坐标
        int length = nums.length;
        Map<Integer, int[]> map = new HashMap<>(nums.length);
        for (int i = 0; i < length; i++) {
            if (map.containsKey(nums[i])) {
                //出现次数+1
                map.get(nums[i])[0]++;
                //终坐标更改
                map.get(nums[i])[2] = i;
            } else {
                map.put(nums[i], new int[]{1, i, i});
            }
        }
        //遍历map 找到最大频数 并记录子数组长度
        int maxF = 0;
        int minLength = 0;
        for (Map.Entry<Integer, int[]> entry : map.entrySet()) {
            int[] value = entry.getValue();
            if (value[0] > maxF) {
                maxF = value[0];
                minLength = value[2] - value[1] + 1;
            }
            if (value[0] == maxF) {
                minLength = Math.min(minLength, value[2] - value[1] + 1);
            }
        }
        return minLength;
    }
}
