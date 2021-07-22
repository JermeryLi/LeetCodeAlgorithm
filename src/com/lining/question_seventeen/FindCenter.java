package com.lining.question_seventeen;

/**
 * @author lining
 * @date 2021/7/21 17:06
 * 1791. 找出星型图的中心节点
 * https://leetcode-cn.com/problems/find-center-of-star-graph/
 * 有一个无向的 星型 图，由 n 个编号从 1 到 n 的节点组成。星型图有一个 中心 节点，并且恰有 n - 1 条边将中心节点与其他每个节点连接起来。
 * 给你一个二维整数数组 edges ，其中 edges[i] = [ui, vi] 表示在节点 ui 和 vi 之间存在一条边。请你找出并返回 edges 所表示星型图的中心节点。
 */
public class FindCenter {
    public int findCenter(int[][] edges) {
        int one = edges[0][0];
        int two = edges[0][1];
        int three = edges[1][0];
        int four = edges[1][1];
        if (one == three || one == four) {
            return one;
        }
        return two;
    }
}
