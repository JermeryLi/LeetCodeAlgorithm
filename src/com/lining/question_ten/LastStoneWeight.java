package com.lining.question_ten;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author lining
 * @date 2020/12/30 10:29
 * https://leetcode-cn.com/problems/last-stone-weight/
 * 一堆石头，每块石头的重量都是正整数。
 * 每一回合，从中选出两块 最重的 石头，然后将它们一起粉碎。假设石头的重量分别为 x 和 y，且 x <= y。那么粉碎的可能结果如下：
 * 如果 x == y，那么两块石头都会被完全粉碎；
 * 如果 x != y，那么重量为 x 的石头将会完全粉碎，而重量为 y 的石头新重量为 y-x。
 * 最后，最多只会剩下一块石头。返回此石头的重量。如果没有石头剩下，就返回 0。
 */
public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        int length = stones.length;
        if (length == 1) {
            return stones[length - 1];
        }
        if (length == 2) {
            return Math.abs(stones[length - 1] - stones[length - 2]);
        }
        Arrays.sort(stones);
        if (stones[length - 3] == 0) {
            return stones[length - 1] - stones[length - 2];
        }
        stones[length - 1] = stones[length - 1] - stones[length - 2];
        stones[length - 2] = 0;
        return lastStoneWeight(stones);
    }

    public static int lastStoneWeight2(int[] stones){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> b - a);
        for (int stone : stones) {
            pq.offer(stone);
        }

        while (pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();
            if (a > b) {
                pq.offer(a - b);
            }
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,3,2};
        lastStoneWeight2(a);
    }
}
