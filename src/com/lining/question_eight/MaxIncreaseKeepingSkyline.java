package com.lining.question_eight;

/***
 * @author lining
 * @time 2025/12/10 23:26
 * https://leetcode.cn/problems/max-increase-to-keep-city-skyline/
 * 807. 保持城市天际线
 * 给你一座由 n x n 个街区组成的城市，每个街区都包含一座立方体建筑。
 * 给你一个下标从 0 开始的 n x n 整数矩阵 grid ，其中 grid[r][c] 表示坐落于 r 行 c 列的建筑物的 高度 。
 * 城市的 天际线 是从远处观察城市时，所有建筑物形成的外部轮廓。从东、南、西、北四个主要方向观测到的 天际线 可能不同。
 * 我们被允许为 任意数量的建筑物 的高度增加 任意增量（不同建筑物的增量可能不同） 。
 * 高度为 0 的建筑物的高度也可以增加。然而，增加的建筑物高度 不能影响 从任何主要方向观察城市得到的 天际线 。
 * 在 不改变 从任何主要方向观测到的城市 天际线 的前提下，返回建筑物可以增加的 最大高度增量总和 。
 **/
public class MaxIncreaseKeepingSkyline {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int count = 0;
        int n = grid.length;
        int[][] result = new int[n][n];
        // 1. 预先计算每一行的最大值
        int[] rowMax = new int[n];
        for (int i = 0; i < n; i++) {
            int max = grid[i][0];
            for (int j = 1; j < n; j++) {
                if (grid[i][j] > max) {
                    max = grid[i][j];
                }
            }
            rowMax[i] = max;
        }

        // 2. 预先计算每一列的最大值
        int[] colMax = new int[n];
        for (int j = 0; j < n; j++) {
            int max = grid[0][j];
            for (int i = 1; i < n; i++) {
                if (grid[i][j] > max) {
                    max = grid[i][j];
                }
            }
            colMax[j] = max;
        }

        // 3. 对于每个元素 arr[i][j]，取所在行和所在列最大值的更小者
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = Math.min(rowMax[i], colMax[j]);
            }
        }

        // 4. 比较并计算
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count += result[i][j] - grid[i][j];
            }
        }
        return count;
    }

}
