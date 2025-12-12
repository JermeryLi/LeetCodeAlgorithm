package com.lining.question_eighteen;

/**
 * 描述：
 * https://leetcode.cn/problems/queries-on-number-of-points-inside-a-circle/
 *
 * @author lining
 * createTime 2023/5/9 18:38
 * 1828. 统计一个圆中点的数目
 * 给你一个数组 points ，其中 points[i] = [xi, yi] ，表示第 i 个点在二维平面上的坐标。多个点可能会有 相同 的坐标。
 * 同时给你一个数组 queries ，其中 queries[j] = [xj, yj, rj] ，表示一个圆心在 (xj, yj) 且半径为 rj 的圆。
 * 对于每一个查询 queries[j] ，计算在第 j 个圆 内 点的数目。如果一个点在圆的 边界上 ，我们同样认为它在圆 内 。
 * 请你返回一个数组 answer ，其中 answer[j]是第 j 个查询的答案。
 */
public class CountPoints {
    public int[] countPoints(int[][] points, int[][] queries) {
        int m = points.length, n = queries.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; ++i) {
            int cx = queries[i][0], cy = queries[i][1], cr = queries[i][2];
            for (int[] point : points) {
                int px = point[0], py = point[1];
                if ((cx - px) * (cx - px) + (cy - py) * (cy - py) <= cr * cr) {
                    ++ans[i];
                }
            }
        }
        return ans;
    }
}

