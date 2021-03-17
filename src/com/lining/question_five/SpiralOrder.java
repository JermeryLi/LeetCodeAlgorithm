package com.lining.question_five;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lining
 * @date 2021/3/15 10:50
 * 给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。
 */
public class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> list = new ArrayList<>();
        int count = 0;
        int maxCount = (m % 2 == 0 ? (m / 2) : (m / 2 + 1));
        while (count < maxCount) {
            for (int i = count; i <= matrix[i].length - i - 1; i++) {
                list.add(matrix[count][i]);
            }
            count++;
        }
        return list;

    }
}
