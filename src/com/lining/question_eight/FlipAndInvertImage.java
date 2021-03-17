package com.lining.question_eight;

/**
 * @author lining
 * @date 2021/2/24 8:54
 * https://leetcode-cn.com/problems/flipping-an-image/
 * 832. 翻转图像
 * 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
 * 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
 * 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
 */
public class FlipAndInvertImage {
    public int[][] flipAndInvertImage(int[][] A) {
        int m = A.length;
        int[][] result = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                result[i][m -j -1] = 1 - A[i][j];
            }
        }
        return result;
    }
}
