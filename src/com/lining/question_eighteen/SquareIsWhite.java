package com.lining.question_eighteen;

/**
 * @author lining
 * @date 2021/4/9 9:38
 * 1812. 判断国际象棋棋盘中一个格子的颜色
 * https://leetcode-cn.com/problems/determine-color-of-a-chessboard-square/
 * 给你一个坐标 coordinates ，它是一个字符串，表示国际象棋棋盘中一个格子的坐标
 */
public class SquareIsWhite {
    public boolean squareIsWhite(String coordinates) {
        char word = coordinates.charAt(0);
        char number = coordinates.charAt(1);
        return ((word - 97) % 2 ^ (number - 49) % 2) == 1;
    }
}
