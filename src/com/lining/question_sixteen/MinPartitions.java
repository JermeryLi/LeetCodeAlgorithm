package com.lining.question_sixteen;

/**
 * @author lining
 * @Time 2023/12/5 8:58
 * https://leetcode.cn/problems/partitioning-into-minimum-number-of-deci-binary-numbers/
 * 1689. 十-二进制数的最少数目
 *
 * 如果一个十进制数字不含任何前导零，且每一位上的数字不是 0 就是 1 ，那么该数字就是一个 十-二进制数 。例如，101 和 1100 都是 十-二进制数，而 112 和 3001 不是。
 *
 * 给你一个表示十进制整数的字符串 n ，返回和为 n 的 十-二进制数 的最少数目。
 */
public class MinPartitions {
    /**
     * 思路：寻找n中的最大数值
     * @param n 只由数字组成的字符串
     * @return 数值
     */
    public int minPartitions(String n) {
        char maxChar = '0';
        for (int i = 0; i < n.length(); i++) {
            char currentChar = n.charAt(i);
            //添加这一步判断，可以提前结束循环，直接返回最大值9
            if(currentChar == '9'){
                return 9;
            }
            if(currentChar > maxChar){
                maxChar = currentChar;
            }
        }
        return maxChar - '0';
    }


}
/**
 * 示例 1：
 *
 * 输入：n = "32"
 * 输出：3
 * 解释：10 + 11 + 11 = 32
 * 示例 2：
 *
 * 输入：n = "82734"
 * 输出：8
 * 示例 3：
 *
 * 输入：n = "27346209830709182346"
 * 输出：9
 *
 *
 * 提示：
 *
 * 1 <= n.length <= 105
 * n 仅由数字组成
 * n 不含任何前导零并总是表示正整数
 */