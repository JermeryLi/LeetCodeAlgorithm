package com.lining.question_twentysix;

import java.util.stream.IntStream;

/**
 * @author lining
 * https://leetcode.cn/problems/maximum-sum-with-exactly-k-elements/description/
 * 2656. K 个元素的最大和
 * 给你一个下标从 0 开始的整数数组 nums 和一个整数 k 。你需要执行以下操作 恰好 k 次，最大化你的得分：
 * 从 nums 中选择一个元素 m 。
 * 将选中的元素 m 从数组中删除。
 * 将新元素 m + 1 添加到数组中。
 * 你的得分增加 m 。
 * 请你返回执行以上操作恰好 k 次后的最大得分。
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [1,2,3,4,5], k = 3
 * 输出：18
 * 解释：我们需要从 nums 中恰好选择 3 个元素并最大化得分。
 * 第一次选择 5 。和为 5 ，nums = [1,2,3,4,6] 。
 * 第二次选择 6 。和为 6 ，nums = [1,2,3,4,7] 。
 * 第三次选择 7 。和为 5 + 6 + 7 = 18 ，nums = [1,2,3,4,8] 。
 * 所以我们返回 18 。
 * 18 是可以得到的最大答案。
 * 示例 2：
 * <p>
 * 输入：nums = [5,5,5], k = 2
 * 输出：11
 * 解释：我们需要从 nums 中恰好选择 2 个元素并最大化得分。
 * 第一次选择 5 。和为 5 ，nums = [5,5,6] 。
 * 第二次选择 6 。和为 6 ，nums = [5,5,7] 。
 * 所以我们返回 11 。
 * 11 是可以得到的最大答案。
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= nums.length <= 100
 * 1 <= nums[i] <= 100
 * 1 <= k <= 100
 */
public class MaximizeSum {
    /**
     * 解题思路：取得最大值，依次 +1 +2
     *
     * @param nums 数组
     * @param k    次数
     * @return 值
     */
    public int maximizeSum(int[] nums, int k) {
        int maxNumber = IntStream.of(nums).max().orElse(Integer.MIN_VALUE);
//        int sum = 0;
//        for (int i = 0; i < k; i++) {
//            sum += (maxNumber + i);
//        }
        //考虑使用等差数据求和
        return (maxNumber + maxNumber + k - 1) * k / 2;
    }


}
