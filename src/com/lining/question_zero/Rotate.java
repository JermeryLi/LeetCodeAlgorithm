package com.lining.question_zero;

/**
 * @author lining
 * @date 2020/12/20 12:01
 * https://leetcode-cn.com/problems/rotate-image/
 * 48. 旋转图像 给定一个 n × n 的二维矩阵表示一个图像。
 * 将图像顺时针旋转 90 度。
 * 说明： 你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
 *
 */
public class Rotate {
    public void rotate(int[][] matrix) {
        //置换
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j > i) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        //对称
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int cp = matrix.length - 1 - j;
                if (cp > j) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][cp];
                    matrix[i][cp] = temp;
                }
            }
        }
    }
}
