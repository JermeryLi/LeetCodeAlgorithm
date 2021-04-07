package com.lining.question_zero;

/**
 * @author lining
 * @date 2021/3/30 9:58
 * https://leetcode-cn.com/problems/search-a-2d-matrix/
 * 74. 搜索二维矩阵
 * 编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：
 * 每行中的整数从左到右按升序排列。
 * 每行的第一个整数大于前一行的最后一个整数。
 */
public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        if (matrix[0][0] > target || matrix[m - 1][n - 1] < target) {
            return false;
        }

        //二分查找
        // 0 - (m-1)
        int begin = 0;
        int end = m - 1;
        int result = 0;
        while (true) {
            if (matrix[begin][0] > target || matrix[end][n - 1] < target) {
                return false;
            }
            if (begin == end) {
                result = end;
                break;
            }
            int temp = (end  + begin) / 2;
            if (matrix[temp][0] == target) {
                return true;
            } else if (matrix[temp][0] > target) {
                end = temp - 1;
            } else {
                begin = temp + 1;
            }
        }
        return true;
    }
}
