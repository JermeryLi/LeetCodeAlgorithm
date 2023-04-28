package com.lining.question_six;

/**
 * 描述：
 *
 * @author lining
 * createTime 2023/4/28 11:26
 * https://leetcode.cn/problems/binary-number-with-alternating-bits/
 * 693. 交替位二进制数
 * 给定一个正整数，检查它的二进制表示是否总是 0、1 交替出现：换句话说，就是二进制表示中相邻两位的数字永不相同。
 */
public class HasAlternatingBits {
    /**
     * 这种方法遍历了两次，
     * 优化方法：可以在生成二进制的时候进行判断
     */
    public boolean hasAlternatingBits(int n) {
        if (n == 1) {
            return true;
        }
        String string = Integer.toBinaryString(n);
        char start = string.charAt(0);
        for (int i = 1; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == start) {
                return false;
            }
            start = c;
        }
        return true;
    }

    public boolean hasAlternatingBits2(int n) {
        if (n == 1) {
            return true;
        }
        int remainder;
        int before = 0;
        int count = 0;
        while (n != 0) {
            count++;
            remainder = n % 2;
            if (count != 1 && remainder == before) {
                return false;
            }
            before = remainder;
            n = n / 2;
        }
        return true;
    }

    public static void main(String[] args) {
        HasAlternatingBits h = new HasAlternatingBits();
        h.hasAlternatingBits2(5);
    }
}
