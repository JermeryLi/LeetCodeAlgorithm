package com.lining.question_four;

/**
 * @author lining
 * @date 2021/4/14 9:57
 * 461. 汉明距离
 * https://leetcode-cn.com/problems/hamming-distance/
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 * 注意： 0 ≤ x, y < 231.
 * <p>
 * 输入: x = 1, y = 4
 * 输出: 2
 * 解释:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 * ↑   ↑
 * 上面的箭头指出了对应二进制位不同的位置。
 */
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int distance = 0;
        while (xor != 0) {
            if (xor % 2 == 1) {
                distance += 1;
            }
            xor = xor >> 1;
        }
        return distance;
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(2));
        System.out.println(2 ^ 2);
    }
}
