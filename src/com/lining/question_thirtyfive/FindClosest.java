package com.lining.question_thirtyfive;

/***
 * @author lining
 * @description
 * @create 2025/4/17 21:40
 * https://leetcode.cn/problems/find-closest-person/
 * 3516. 找到最近的人
 * 给你三个整数 x、y 和 z，表示数轴上三个人的位置：
 * x 是第 1 个人的位置。
 * y 是第 2 个人的位置。
 * z 是第 3 个人的位置，第 3 个人 不会移动 。
 * 第 1 个人和第 2 个人以 相同 的速度向第 3 个人移动。
 * 判断谁会 先 到达第 3 个人的位置：
 * 如果第 1 个人先到达，返回 1 。
 * 如果第 2 个人先到达，返回 2 。
 * 如果两个人同时到达，返回 0 。
 * 根据上述规则返回结果。
 * 输入： x = 2, y = 7, z = 4
 * 输出： 1
 * 解释：
 * 第 1 个人在位置 2，到达第 3 个人（位置 4）需要 2 步。
 * 第 2 个人在位置 7，到达第 3 个人需要 3 步。
 * 由于第 1 个人先到达，所以输出为 1。
 **/
public class FindClosest {
    public int findClosest(int x, int y, int z) {
        int xz = Math.abs(x - z);
        int yz = Math.abs(y - z);
        return xz < yz ? 1 : xz == yz ? 0 : 2;
    }

}
