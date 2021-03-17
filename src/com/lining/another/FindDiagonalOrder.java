package com.lining.another;

/**
 * @author lining
 * @date 2021/3/3 18:06
 */
public class FindDiagonalOrder {
    public static int[] findDiagonalOrder(int[][] matrix) {
        int m = matrix.length;
        if (m == 0) {
            return new int[]{};
        }
        int n = matrix[0].length;
        int[] array = new int[m * n];
        boolean up = true;
        array[0] = matrix[0][0];
        int x = 0;
        int y = 0;
        int point = 1;
        while (x <= m - 1 && y <= n - 1) {
            if (x == m - 1 && y == n - 1) {
                break;
            }
            if (up) {
                x--;
                y++;
                if (x < 0 && y <= n - 1) {
                    x++;
                    up = !up;
                } else if (x <= 0 && y > n - 1) {
                    x += 2;
                    y--;
                    up = !up;
                } else if (x > 0 && y > n - 1) {
                    x += 2;
                    y--;
                    up = !up;
                }
            } else {
                x++;
                y--;
                if (y < 0 && x <= m - 1) {
                    y++;
                    up = !up;
                } else if (y >= 0 && x > m - 1) {
                    y += 2;
                    x--;
                    up = !up;
                } else if (y < 0 && x > m - 1) {
                    x--;
                    y += 2;
                    up = !up;
                }
            }
            array[point] = matrix[x][y];
            point++;
            if (x == m - 1 && y == n - 1) {
                break;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}};
        int[][] matrix1 = {{2, 5}, {8, 4}, {0, -1}};
        int[][] matrix2 = {{1}, {2}, {3}, {4}, {5}, {6}, {7}, {8}, {9}, {10}};
        System.out.println(findDiagonalOrder(matrix2));
    }
}
