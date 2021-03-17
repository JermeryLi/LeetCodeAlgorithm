package com.lining.question_six;

/**
 * @author lining
 * @date 2021/2/4 9:55
 * https://leetcode-cn.com/problems/maximum-average-subarray-i/
 * 643. 子数组最大平均数 I
 * [1,12,-5,-6,50,3], k = 4
 */
public class FindMaxAverage {
    public double findMaxAverage2(int[] nums, int k) {
        int sum = 0;
        int length = nums.length;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int max = sum;
        //遍历length-k
        for (int i = 1; i <= length - k; i++) {
            sum = sum - nums[i - 1] + nums[i + k - 1];
            max = Math.max(sum, max);
        }
        return 1.0 * max / k;
    }
    // i  i + k -1
    // i+1  i+K


    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        //遍历n - k
        for (int i = k; i < n; i++) {
            sum = sum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        return 1.0 * maxSum / k;
    }
}
