package com.lining.question_twentyone;

/**
 * 描述：
 *
 * @author lining
 * createTime 2023/4/10 14:16
 * https://leetcode.cn/problems/count-integers-with-even-digit-sum/
 * 2180. 统计各位数字之和为偶数的整数个数
 * 给你一个正整数 num ，请你统计并返回 小于或等于 num 且各位数字之和为 偶数 的正整数的数目。
 * 正整数的 各位数字之和 是其所有位上的对应数字相加的结果。
 *
 * 输入：num = 4
 * 输出：2
 * 解释： 只有 2 和 4 满足小于等于 4 且各位数字之和为偶数。
 * 1 <= num <= 1000
 *
 * 输入：num = 30
 * 输出：14
 * 解释：
 * 只有 14 个整数满足小于等于 30 且各位数字之和为偶数，分别是：
 * 2、4、6、8、11、13、15、17、19、20、22、24、26 和 28 。
 */
public class CountEven {
    public int countEven(int num) {
        int count = 0, first, second;
        int third = 0;
        for (int i = 1; i <= num && i != 1000; i++) {
            first = i % 10;
            if (i >= 10 && i < 100) {
                second = i / 10;
            } else {
                second = (i / 10) % 10;
                third = i / 100;
            }
            int sum = first + second + third;
            if (sum % 2 == 0) {
                count++;
            }
        }
        return count;
    }

}
