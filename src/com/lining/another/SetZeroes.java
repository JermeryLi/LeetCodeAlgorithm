package com.lining.another;

import java.util.*;

/**
 * @author lining
 * @date 2021/3/1 17:03
 * 编写一种算法，若M × N矩阵中某个元素为0，则将其所在的行与列清零。
 * https://leetcode-cn.com/leetbook/read/array-and-string/ciekh/
 */
public class SetZeroes {
    public void setZeroes(int[][] matrix) {
        int length = matrix.length;
        int size = matrix[0].length;
        Set<Integer> heng = new HashSet<>();
        Set<Integer> shu = new HashSet<>();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] == 0) {
                    heng.add(i);
                    shu.add(j);
                }
            }
        }

        Iterator<Integer> iterator = heng.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            for (int i = 0; i < size; i++) {
                matrix[next][i] = 0;
            }
        }
        Iterator<Integer> iterator2 = shu.iterator();
        while (iterator2.hasNext()) {
            Integer next = iterator2.next();
            for (int i = 0; i < length; i++) {
                matrix[i][next] = 0;
            }

        }
    }
}
