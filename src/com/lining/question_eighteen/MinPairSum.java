package com.lining.question_eighteen;

import java.util.Arrays;

/**
 * @author lining
 * @date 2021/7/20 13:31
 * https://leetcode-cn.com/problems/minimize-maximum-pair-sum-in-array/
 * 1877. 数组中最大数对和的最小值
 * <p>
 * 一个数对 (a,b) 的 数对和 等于 a + b 。最大数对和 是一个数对数组中最大的 数对和 。
 * <p>
 * 比方说，如果我们有数对 (1,5) ，(2,3) 和 (4,4)，最大数对和 为 max(1+5, 2+3, 4+4) = max(6, 5, 8) = 8 。
 * 给你一个长度为 偶数 n 的数组 nums ，请你将 nums 中的元素分成 n / 2 个数对，使得：
 * <p>
 * nums 中每个元素 恰好 在 一个 数对中，且
 * 最大数对和 的值 最小 。
 * 请你在最优数对划分的方案下，返回最小的 最大数对和 。
 */
public class MinPairSum {
    private static int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int minSum = nums[0] + nums[n - 1];
        for (int i = 1; i <= (n - 1) / 2; i++) {
            minSum = Math.max(minSum, nums[i] + nums[n - 1 - i]);
        }
        return minSum;
     }
}


//做出来很简单，就是排序然后首尾相加，问题是，怎么证明这个是最优解？
//
//我们以最简单的例子来看，假设有四个数，a >= b >= c >= d，证明最优解为(a, d) 与 (b, c)
//
//证明也很简单，反证法假设最优不是首尾，而是例如(a, c) 和 (b, d) 因为a>=b, c>=d所以最大和为 a + c ，而进一步 a + c >= a + d 且 a + c >= b + c ，因此(a, c)不是最优解，进一步也可以证明(a + b)更不是最优解
//
//以上证明完之后，进一步延伸可知对任意长度数组成立，否则若不是首尾连接则必定能找到当中的四个数abcd对应上面证明的情况

//输入：nums = [3,5,2,3]
//输出：7
//解释：数组中的元素可以分为数对 (3,3) 和 (5,2) 。
//最大数对和为 max(3+3, 5+2) = max(6, 7) = 7 。

// a b c d e   f g h i j
// aj bi ch dg ef
