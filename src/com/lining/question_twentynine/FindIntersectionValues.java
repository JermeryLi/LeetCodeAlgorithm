package com.lining.question_twentynine;

import java.util.HashSet;

/***
 * @author lining
 * @time 2025/12/2 22:15
 * https://leetcode.cn/problems/find-common-elements-between-two-arrays/
 * 2956. 找到两个数组中的公共元素
 * 给你两个下标从 0 开始的整数数组 nums1 和 nums2 ，它们分别含有 n 和 m 个元素。请你计算以下两个数值：
 *
 * answer1：使得 nums1[i] 在 nums2 中出现的下标 i 的数量。
 * answer2：使得 nums2[i] 在 nums1 中出现的下标 i 的数量。
 * 返回 [answer1, answer2]。
 *
 * 示例 1：
 * 输入：nums1 = [2,3,2], nums2 = [1,2]
 * 输出：[2,1]
 * 解释：
 *
 *
 * 示例 2：
 * 输入：nums1 = [4,3,2,3,1], nums2 = [2,2,5,2,3,6]
 * 输出：[3,4]
 * 解释：
 * nums1 中下标在 1，2，3 的元素在 nums2 中也存在。所以 answer1 为 3。
 * nums2 中下标在 0，1，3，4 的元素在 nums1 中也存在。所以 answer2 为 4。

 * 示例 3：
 * 输入：nums1 = [3,4,2,3], nums2 = [1,5]
 * 输出：[0,0]
 * 解释：
 * nums1 和 nums2 中没有相同的数字，所以答案是 [0,0]。
 *
 * 提示：
 * n == nums1.length
 * m == nums2.length
 * 1 <= n, m <= 100
 * 1 <= nums1[i], nums2[i] <= 100
 **/
public class FindIntersectionValues {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int num1Count = 0;
        for (int i : nums1) {
            for (int i1 : nums2) {
                if (i == i1) {
                    num1Count++;
                    break;
                }
            }
        }
        int nums2Count = 0;
        for (int i : nums2) {
            for (int i1 : nums1) {
                if (i == i1) {
                    nums2Count++;
                    break;
                }
            }
        }
        return new int[]{num1Count, nums2Count};
    }

    public int[] findIntersectionValues2(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }
        int[] result = new int[2];
        for (int i : nums1) {
            if (set2.contains(i)) {
                result[0]++;
            }
        }
        for (int i : nums2) {
            if (set1.contains(i)) {
                result[1]++;
            }
        }
        return result;
    }
}
