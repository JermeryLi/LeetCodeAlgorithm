package com.lining.question_two;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lining
 * @date 2021/1/10 15:41
 * https://leetcode-cn.com/problems/summary-ranges/
 * 228. 汇总区间
 * 给定一个无重复元素的有序整数数组 nums 。
 * 返回 恰好覆盖数组中所有数字 的 最小有序 区间范围列表。也就是说，nums 的每个元素都恰好被某个区间范围所覆盖，并且不存在属于某个范围但不属于 nums 的数字 x 。
 * 列表中的每个区间范围 [a,b] 应该按如下格式输出：
 * "a->b" ，如果 a != b
 * "a" ，如果 a == b
 */
public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int i = 0;
        int length = nums.length;
        while (i < length) {
            int low = i;
            i++;
            while (i < length && nums[i] == nums[i - 1] + 1) {
                i++;
            }
            int high = i - 1;
            StringBuffer temp = new StringBuffer(Integer.toString(nums[low]));
            if (low < high) {
                temp.append("->");
                temp.append(nums[high]);
            }
            list.add(temp.toString());
        }
        return list;
    }

    //    ["0->2"]
//    预期结果
//["0->2","4->5","7"]
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4, 5, 7};
        System.out.println(summaryRanges(nums));
    }
}
