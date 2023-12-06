package com.lining.question_twentyfive;

import java.util.Arrays;

/**
 * @author lining
 * @Time 2023/12/6 11:11
 * https://leetcode.cn/problems/sort-the-students-by-their-kth-score/description/
 * 2545. 根据第 K 场考试的分数排序
 * 班里有 m 位学生，共计划组织 n 场考试。给你一个下标从 0 开始、大小为 m x n 的整数矩阵 score ，其中每一行对应一位学生，而 score[i][j] 表示第 i 位学生在第 j 场考试取得的分数。矩阵 score 包含的整数 互不相同 。
 * 另给你一个整数 k 。请你按第 k 场考试分数从高到低完成对这些学生（矩阵中的行）的排序。
 * 返回排序后的矩阵。
 */
public class SortTheStudents {
    /**
     * 依次找到最大值，然后交换
     */
    public int[][] sortTheStudents(int[][] score, int k) {
        int length = score.length;
        int size = score[0].length;
        for (int i = 0; i < length - 1; i++) {
            int max = score[i][k];
            int maxIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (score[j][k] > max) {
                    // 找到最大值
                    max = score[j][k];
                    // 最大值坐标
                    maxIndex = j;
                }
            }
            //最大值行 与当前行交换
            //最大值行 与当前行不同
            if (i != maxIndex) {
                for (int i1 = 0; i1 < size; i1++) {
                    int iValue = score[i][i1];
                    score[i][i1] = score[maxIndex][i1];
                    score[maxIndex][i1] = iValue;
                }
            }
        }
        // 排序
//        Arrays.sort(score, (a, b) -> b[k] - a[k]);

        return score;

    }
}
