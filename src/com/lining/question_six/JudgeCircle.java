package com.lining.question_six;

/**
 * 描述：
 * 657. 机器人能否返回原点
 * https://leetcode-cn.com/problems/robot-return-to-origin/
 * 在二维平面上，有一个机器人从原点 (0, 0) 开始。给出它的移动顺序，判断这个机器人在完成移动后是否在 (0, 0) 处结束。
 * 移动顺序由字符串表示。字符 move[i] 表示其第 i 次移动。机器人的有效动作有 R（右），L（左），U（上）和 D（下）。
 * 如果机器人在完成所有动作后返回原点，则返回 true。否则，返回 false。
 * 注意：机器人“面朝”的方向无关紧要。 “R” 将始终使机器人向右移动一次，“L” 将始终向左移动等。此外，假设每次移动机器人的移动幅度相同。
 *
 * @author lining
 * createTime 2021/9/10 14:12
 */
public class JudgeCircle {
    /**
     * 可以优化的地方，分别用x、y代表水平方向和竖直方向
     * x++、x--
     * y++、y--
     */
    public boolean judgeCircle(String moves) {
        int uCount = 0, dCount = 0, lCount = 0, rCount = 0;
        int length = moves.length();
        if (length % 2 == 1) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char c = moves.charAt(i);
            if (c == 'U') {
                uCount++;
            } else if (c == 'D') {
                dCount++;
            } else if (c == 'L') {
                lCount++;
            } else {
                rCount++;
            }
        }
        return uCount == dCount && lCount == rCount;
    }
}
