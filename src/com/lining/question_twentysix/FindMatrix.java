package com.lining.question_twentysix;

import java.util.*;

/***
 * @author lining
 * @time 2025/12/16 23:35
 * https://leetcode.cn/problems/convert-an-array-into-a-2d-array-with-conditions/
 * 2610. 转换二维数组
 * 给你一个整数数组 nums 。请你创建一个满足以下条件的二维数组：
 *
 * 二维数组应该 只 包含数组 nums 中的元素。
 * 二维数组中的每一行都包含 不同 的整数。
 * 二维数组的行数应尽可能 少 。
 * 返回结果数组。如果存在多种答案，则返回其中任何一种。
 *
 * 请注意，二维数组的每一行上可以存在不同数量的元素。
 **/
public class FindMatrix {
    public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int x : nums) {
            cnt.put(x, cnt.getOrDefault(x, 0) + 1);
        }

        List<List<Integer>> ans = new ArrayList<>();
        while (!cnt.isEmpty()) {
            List<Integer> arr = new ArrayList<>();
            Iterator<Map.Entry<Integer, Integer>> it = cnt.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer, Integer> entry = it.next();
                entry.setValue(entry.getValue() - 1);
                arr.add(entry.getKey());
                if (entry.getValue() == 0) {
                    it.remove();
                }
            }
            ans.add(arr);
        }

        return ans;

    }
}
