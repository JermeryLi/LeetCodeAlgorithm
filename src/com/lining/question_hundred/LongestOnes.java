package com.lining.question_hundred;

/**
 * @author lining
 * @date 2021/2/19 8:54
 * https://leetcode-cn.com/problems/max-consecutive-ones-iii/
 * 1004. 最大连续1的个数 III
 * 给定一个由若干 0 和 1 组成的数组 A，我们最多可以将 K 个值从 0 变成 1 。
 * 返回仅包含 1 的最长（连续）子数组的长度。
 * 输入：A = [1,1,1,0,0,0,1,1,1,1,0], K = 2
 * 输出：6
 * 解释：
 * [1,1,1,0,0,1,1,1,1,1,1]
 * 粗体数字从 0 翻转到 1，最长的子数组长度为 6。
 */
public class LongestOnes {

    public int longestOnes(int[] A, int K) {
        int n = A.length;
        int left = 0, lsum = 0, rsum = 0;
        int ans = 0;
        for (int right = 0; right < n; ++right) {
            rsum += 1 - A[right];
            while (lsum < rsum - K) {
                lsum += 1 - A[left];
                ++left;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }

    public int longestOnes2(int[] A, int K) {
        int n = A.length;
        //最大的长度
        int res = 0;
        //左端点、右端点
        int left = 0, right = 0;
        //子数组中0的长度
        int zeros = 0;
        while (right < n) {
            if (A[right] == 0) {
                zeros++;
            }
            while (zeros > K) {
                if (A[left++] == 0) {
                    zeros--;
                }
            }
            res = Math.max(res, right - left + 1);
            right++;
        }
        return res;
    }

    public int longestOnes3(int[] A, int K) {
        int n = A.length;
        int left = 0;
        int right = 0;
        int zeros = 0;
        int res = 0;
        while (right < n) {
            if (A[right] == 0) {
                zeros++;
            }
            while (zeros > K) {
                if (A[left++] == 0) {
                    zeros--;
                }
            }
            res = Math.max(res, right - left + 1);
            right++;
        }
        return res;
    }


}
