package com.lining.question_seventeen;

/**
 * @author lining
 * @date 2021/4/9 9:19
 * 1732. 找到最高海拔
 * https://leetcode-cn.com/problems/find-the-highest-altitude/
 * 有一个自行车手打算进行一场公路骑行，这条路线总共由 n + 1 个不同海拔的点组成。
 * 自行车手从海拔为 0 的点 0 开始骑行。
 * 给你一个长度为 n 的整数数组 gain ，其中 gain[i] 是点 i 和点 i + 1 的 净海拔高度差（0 <= i < n）。
 * 请你返回 最高点的海拔 。
 * 输入：gain = [-5,1,5,0,-7]
 * 输出：1
 * 解释：海拔高度依次为 [0,-5,-4,1,1,-6] 。最高海拔为 1 。
 */
public class LargestAltitude {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int currentHeight =  0;
        for (int value : gain) {
            currentHeight = value + currentHeight;
            max = Math.max(currentHeight, max);
        }
        return max;
        //后面的高度 - 前面的高度 = 高度差
    }
}
