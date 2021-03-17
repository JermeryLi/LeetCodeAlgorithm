package com.lining.question_seven;

/**
 * @author lining
 * @date 2021/2/23 16:06
 * https://leetcode-cn.com/problems/toeplitz-matrix/
 * 给你一个 m x n 的矩阵 matrix 。如果这个矩阵是托普利茨矩阵，返回 true ；否则，返回 false 。
 * 如果矩阵上每一条由左上到右下的对角线上的元素都相同，那么这个矩阵是 托普利茨矩阵 。
 * 766. 托普利茨矩阵
 */
public class IsToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            int max;
            if (i == 0) {
                max = m - 2;
            } else {
                max = 0;
            }
            for (int j = 0; j <= max; j++) {
                int matrix1 = matrix[i][j];
                int N = i + 1;
                int M = j + 1;
                while (N < n && M < m) {
                    if (matrix[N][M] != matrix1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    //判断一个元素和其左上角的元素是否相等
    public boolean isToeplitzMatrix2(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 1; i < m ; i++) {
            for (int j = 1; j < n; j++) {
                if(matrix[i][j] != matrix[i-1][j-1]){
                    return false;
                }
            }
        }
        return true;
    }
}
