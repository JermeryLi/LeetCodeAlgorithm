package com.lining.question_thirtyseven;

/***
 * @author lining
 * @time 2025/11/29 22:55
 * https://leetcode.cn/problems/compute-alternating-sum/
 *
 * 3701. 计算交替和
 * 给你一个整数数组 nums。
 * 交替和定义为：将 nums中偶数下标位置的元素相加 ，减去奇数下标位置的元素。
 * 即：nums[0] - nums[1] + nums[2] - nums[3]...
 * 返回表示 nums 的交替和的整数。
 *
 * 示例 1：
 * 输入： nums = [1,3,5,7]
 * 输出： -4
 * 解释：
 * 偶数下标位置的元素是 nums[0] = 1 和 nums[2] = 5，因为 0 和 2 是偶数。
 * 奇数下标位置的元素是 nums[1] = 3 和 nums[3] = 7，因为 1 和 3 是奇数。
 * 交替和为 nums[0] - nums[1] + nums[2] - nums[3] = 1 - 3 + 5 - 7 = -4。
 *
 * 示例 2：
 * 输入： nums = [100]
 * 输出： 100
 * 解释：
 * 唯一的偶数下标位置的元素是 nums[0] = 100，因为 0 是偶数。
 * 没有奇数下标位置的元素。
 * 交替和为 nums[0] = 100。
 *
 * 提示：
 * 1 <= nums.length <= 100
 * 1 <= nums[i] <= 100
 **/
public class AlternatingSum {
    public int alternatingSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                sum += nums[i];
            } else {
                sum -= nums[i];
            }
        }
        return sum;
    }
}
