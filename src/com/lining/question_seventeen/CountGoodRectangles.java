package com.lining.question_seventeen;

/**
 * @author lining
 * @date 2021/7/22 14:25
 * https://leetcode-cn.com/problems/number-of-rectangles-that-can-form-the-largest-square/
 * 1725. 可以形成最大正方形的矩形数目
 * <p>
 * 给你一个数组 rectangles ，其中 rectangles[i] = [li, wi] 表示第 i 个矩形的长度为 li 、宽度为 wi 。
 * 如果存在 k 同时满足 k <= li 和 k <= wi ，就可以将第 i 个矩形切成边长为 k 的正方形。例如，矩形 [4,6] 可以切成边长最大为 4 的正方形。
 * 设 maxLen 为可以从矩形数组 rectangles 切分得到的 最大正方形 的边长。*
 * 请你统计有多少个矩形能够切出边长为 maxLen 的正方形，并返回矩形 数目 。
 * <p>
 * 给你一个数组 rectangles ，其中 rectangles[i] = [li, wi] 表示第 i 个矩形的长度为 li 、宽度为 wi 。
 * <p>
 * 如果存在 k 同时满足 k <= li 和 k <= wi ，就可以将第 i 个矩形切成边长为 k 的正方形。例如，矩形 [4,6] 可以切成边长最大为 4 的正方形。
 * 设 maxLen 为可以从矩形数组 rectangles 切分得到的 最大正方形 的边长。*
 * 请你统计有多少个矩形能够切出边长为 maxLen 的正方形，并返回矩形 数目 。
 */
public class CountGoodRectangles {
    public int countGoodRectangles(int[][] rectangles) {
        int number = 0;
        int count = 0;
        for (int[] rectangle : rectangles) {
            int l = rectangle[0];
            int w = rectangle[1];
            int minLen = Math.min(l, w);
            if (minLen > number) {
                number = minLen;
                count = 1;
            } else if (minLen == number) {
                count++;
            }
        }
        return count;
    }
}
