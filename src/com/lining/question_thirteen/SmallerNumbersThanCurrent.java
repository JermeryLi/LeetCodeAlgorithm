package com.lining.question_thirteen;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author lining
 * @date 2021/1/4 14:07
 * 1365. 有多少小于当前数字的数字
 * 给你一个数组 nums，对于其中每个元素 nums[i]，请你统计数组中比它小的所有数字的数目。
 * 换而言之，对于每个 nums[i] 你必须计算出有效的 j 的数量，其中 j 满足 j != i 且 nums[j] < nums[i] 。
 * 以数组形式返回答案。
 * https://leetcode-cn.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 */
public class SmallerNumbersThanCurrent {
    //暴力
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int length = nums.length;
        int[] count = new int[length];
        for (int i = 0; i < length; i++) {
            int num = 0;
            for (int j = 0; j < length; j++) {
                if (nums[i] > nums[j]) {
                    num++;
                }
            }
            count[i] = num;
        }
        return count;
    }

    //排序
    public static int[] smallerNumbersThanCurrent2(int[] nums) {
        int length = nums.length;
        //用二维数组存储之前的数组的值和其index
        int[][] data = new int[length][2];
        for (int i = 0; i < length; i++) {
            data[i][0] = nums[i];
            data[i][1] = i;
        }
        //对二维数组进行排序 排序规则为之前数组的值 排序之后index还带着
        Arrays.sort(data, new Comparator<int[]>() {
            @Override
            public int compare(int[] data1, int[] data2) {
                return data1[0] - data2[0];
            }
        });
        int[] ret = new int[length];
        ret[data[0][1]] = 0;
        int count = 1;
        for (int i = 1; i < data.length; i++) {
            if (data[i][0] == data[i - 1][0]) {
                ret[data[i][1]] = ret[data[i - 1][1]];
                count += 1;
            } else {
                ret[data[i][1]] = ret[data[i - 1][1]] + count;
                count = 1;
            }
        }
        return ret;
    }
}
