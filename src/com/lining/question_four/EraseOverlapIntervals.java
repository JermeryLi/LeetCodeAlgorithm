package com.lining.question_four;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author lining
 * @date 2020/12/31 9:11
 * https://leetcode-cn.com/problems/non-overlapping-intervals/
 * 435. 无重叠区间
 * 给定一个区间的集合，找到需要移除区间的最小数量，使剩余区间互不重叠。
 * 注意:
 * 可以认为区间的终点总是大于它的起点。
 * 区间 [1,2] 和 [2,3] 的边界相互“接触”，但没有相互重叠。
 */
public class EraseOverlapIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count = 0;
        Arrays.sort(intervals, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            }
            return o1[0] - o2[0];
        });
        int index = 0;
        for (int i = 0; i < intervals.length - 1; i++) {
        }
        return count;
    }

    public static void main(String[] args) {
//         [ [1,2], [2,3], [3,4], [1,3] ]
        int a[][] = new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}};


        int index = 0;

    }
}
