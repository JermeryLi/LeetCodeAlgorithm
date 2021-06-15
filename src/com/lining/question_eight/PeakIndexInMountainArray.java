package com.lining.question_eight;

/**
 * @author lining
 * @date 2021/6/15 10:36
 * 852. 山脉数组的峰顶索引
 * https://leetcode-cn.com/problems/peak-index-in-a-mountain-array/
 * 符合下列属性的数组 arr 称为 山脉数组 ：
 * arr.length >= 3
 * 存在 i（0 < i < arr.length - 1）使得：
 * arr[0] < arr[1] < ... arr[i-1] < arr[i]
 * arr[i] > arr[i+1] > ... > arr[arr.length - 1]
 * 给你由整数组成的山脉数组 arr ，返回任何满足 arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1] 的下标 i 。
 */
public class PeakIndexInMountainArray {
    /**
     * 时间复杂度是 O(n)
     * 考虑使用二分的方法来降低时间复杂度
     */
    public int peakIndexInMountainArray(int[] arr) {
        int max = arr[1];
        int maxIndex = 1;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max) {
                maxIndex = i;
                max = arr[i];
            } else {
                break;
            }
        }
        return maxIndex;
    }

    public int peakIndexInMountainArray2(int[] arr) {
        int n = arr.length;
        int left = 1, right = n - 2, ans = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > arr[mid + 1]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
    //   0  1  2  3   4  5  6  7  8  9
    //  [24,69,100,99,79,78,67,36,26,19]
    //left right ans mid
    // 1   8  0  4
    //



}
