package com.lining.question_fifteen;

/**
 * @author lining
 * @date 2021/4/9 9:48
 * 1588. 所有奇数长度子数组的和
 * https://leetcode-cn.com/problems/sum-of-all-odd-length-subarrays/
 * 给你一个正整数数组 arr ，请你计算所有可能的奇数长度子数组的和。
 * 输入：arr = [1,4,2,5,3]
 * 输出：58
 * 解释：所有奇数长度子数组和它们的和为：
 * [1] = 1
 * [4] = 4
 * [2] = 2
 * [5] = 5
 * [3] = 3
 * [1,4,2] = 7
 * [4,2,5] = 11
 * [2,5,3] = 10
 * [1,4,2,5,3] = 15
 * 我们将所有值求和得到 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
 */
public class SumOddLengthSubarrays {
    public int sumOddLengthSubarrays(int[] arr) {
        int length = arr.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            int index = i;
            int tempCount = 0;
            while (index <= length - 1) {
                if (index == i) {
                    tempCount = arr[index];
                } else {
                    tempCount = tempCount + arr[index] + arr[index - 1];
                }
                count += tempCount;
                index += 2;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {};
        SumOddLengthSubarrays sum = new SumOddLengthSubarrays();
        System.out.println(sum.sumOddLengthSubarrays(arr));
    }
}
