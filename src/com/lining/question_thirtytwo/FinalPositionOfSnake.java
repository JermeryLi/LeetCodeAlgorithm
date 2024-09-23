package com.lining.question_thirtytwo;

import java.util.List;

/***
 * @author lining
 * @description
 * @create 2024/9/23 22:04
 * 3248. 矩阵中的蛇
 * https://leetcode.cn/problems/snake-in-matrix/description/
 * 大小为 n x n 的矩阵 grid 中有一条蛇。蛇可以朝 四个可能的方向 移动。矩阵中的每个单元格都使用位置进行标识： grid[i][j] = (i * n) + j。
 * 蛇从单元格 0 开始，并遵循一系列命令移动。
 * 给你一个整数 n 表示 grid 的大小，另给你一个字符串数组 commands，其中包括 "UP"、"RIGHT"、"DOWN" 和 "LEFT"。题目测评数据保证蛇在整个移动过程中将始终位于 grid 边界内。
 * 返回执行 commands 后蛇所停留的最终单元格的位置。
 **/
public class FinalPositionOfSnake {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int i = 0;
        int j = 0;
        for (String command : commands) {
            if ("UP".equals(command)) {
                i -= 1;
            } else if ("DOWN".equals(command)) {
                i += 1;
            } else if ("RIGHT".equals(command)) {
                j += 1;
            } else {
                j -= 1;
            }
        }
        return (i * n) + j;
    }
}
