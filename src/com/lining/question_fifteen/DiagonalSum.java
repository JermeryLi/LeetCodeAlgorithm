package com.lining.question_fifteen;

/**
 * @author lining
 * @date 2021/4/9 8:52
 * 1572. 矩阵对角线元素的和
 * https://leetcode-cn.com/problems/matrix-diagonal-sum/
 * 给你一个正方形矩阵 mat，请你返回矩阵对角线元素的和。
 * 请你返回在矩阵主对角线上的元素和副对角线上且不在主对角线上元素的和。
 */
public class DiagonalSum {
    public int diagonalSum(int[][] mat) {
        int length = mat.length;
        int count = 0;
        int y = length - 1;
        for (int i = 0; i < length; i++) {
            count += mat[i][i];
            count += mat[i][y--];
        }
        if (length % 2 == 1) {
            int index = (length - 1) / 2;
            count -= mat[index][index];
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        DiagonalSum sum = new DiagonalSum();
        System.out.println(sum.diagonalSum(a));
    }
}
