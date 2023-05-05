package com.lining.question_ten;

import java.util.Arrays;

/**
 * 描述：
 * https://leetcode.cn/problems/height-checker/
 * 1051. 高度检查器
 * 学校打算为全体学生拍一张年度纪念照。根据要求，学生需要按照 非递减 的高度顺序排成一行。
 * 排序后的高度情况用整数数组 expected 表示，其中 expected[i] 是预计排在这一行中第 i 位的学生的高度（下标从 0 开始）。
 * 给你一个整数数组 heights ，表示 当前学生站位 的高度情况。heights[i] 是这一行中第 i 位学生的高度（下标从 0 开始）。
 * 返回满足 heights[i] != expected[i] 的 下标数量 。
 * 1 <= heights.length <= 100
 * 1 <= heights[i] <= 100
 *
 * @author lining
 * createTime 2023/5/4 18:52
 * lastModify
 * lastModifyTime
 * 小组
 */
public class HeightChecker {
    public int heightChecker(int[] heights) {
        int count = 0;
        int[] temp = heights.clone();
        Arrays.sort(temp);
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
}
