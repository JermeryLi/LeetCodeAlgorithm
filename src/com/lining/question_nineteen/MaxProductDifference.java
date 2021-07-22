package com.lining.question_nineteen;

import java.util.Arrays;

/**
 * @author lining
 * @date 2021/7/21 16:17
 * 1913. 两个数对之间的最大乘积差
 * https://leetcode-cn.com/problems/maximum-product-difference-between-two-pairs/
 * 两个数对 (a, b) 和 (c, d) 之间的 乘积差 定义为 (a * b) - (c * d) 。
 * <p>
 * 例如，(5, 6) 和 (2, 7) 之间的乘积差是 (5 * 6) - (2 * 7) = 16 。
 * 给你一个整数数组 nums ，选出四个 不同的 下标 w、x、y 和 z ，使数对 (nums[w], nums[x]) 和 (nums[y], nums[z]) 之间的 乘积差 取到 最大值 。
 * <p>
 * 返回以这种方式取得的乘积差中的 最大值 。
 */
public class MaxProductDifference {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        return nums[length - 1] * nums[length - 2] - nums[0] * nums[1];
    }
}
