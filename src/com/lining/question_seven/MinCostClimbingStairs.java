package com.lining.question_seven;

/**
 * @author lining
 * @date 2020/12/21 9:09
 * https://leetcode-cn.com/problems/min-cost-climbing-stairs/
 */
public class MinCostClimbingStairs {
    public static int minCostClimbingStairs(int[] cost) {
        int[] f = new int[cost.length];
        f[0] = 0;
        f[1] = Math.min(cost[0], cost[1]);
        for (int i = 2; i < cost.length; i++) {
            f[i] = Math.min(f[i - 1] + cost[i], f[i - 2] + cost[i - 1]);
        }
        return f[f.length - 1];
    }
}
