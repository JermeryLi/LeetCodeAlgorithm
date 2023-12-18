package com.lining.question_twentythree;

/**
 * @author lining
 * @Time 2023/12/18 9:33
 * 2373. 矩阵中的局部最大值
 * https://leetcode.cn/problems/largest-local-values-in-a-matrix/description/
 * 给你一个大小为 n x n 的整数矩阵 grid 。
 * 生成一个大小为 (n - 2) x (n - 2) 的整数矩阵  maxLocal ，并满足：
 * maxLocal[i][j] 等于 grid 中以 i + 1 行和 j + 1 列为中心的 3 x 3 矩阵中的 最大值 。
 * 换句话说，我们希望找出 grid 中每个 3 x 3 矩阵中的最大值。
 * 返回生成的矩阵。
 */
public class LargestLocal {
    public int[][] largestLocal(int[][] grid) {
        int length = grid.length;
        int[][] arr = new int[length - 2][length - 2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int max = grid[i][j];
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        max = Math.max(max, grid[k][l]);
                    }
                }
                arr[i][j] = max;
            }
        }
        return arr;
    }
}
