package com.lining.question_eighteen;

/**
 * 描述：
 * 1894. 找到需要补充粉笔的学生编号
 * https://leetcode-cn.com/problems/find-the-student-that-will-replace-the-chalk/
 *
 * @author lining
 * createTime 2021/9/10 13:25
 * 一个班级里有 n 个学生，编号为 0 到 n - 1 。每个学生会依次回答问题，编号为 0 的学生先回答，然后是编号为 1 的学生，以此类推，直到编号为 n - 1 的学生，然后老师会重复这个过程，重新从编号为 0 的学生开始回答问题。
 * 给你一个长度为 n 且下标从 0 开始的整数数组 chalk 和一个整数 k 。一开始粉笔盒里总共有 k 支粉笔。当编号为 i 的学生回答问题时，他会消耗 chalk[i] 支粉笔。如果剩余粉笔数量 严格小于 chalk[i] ，那么学生 i 需要 补充 粉笔。
 * 请你返回需要 补充 粉笔的学生 编号 
 * chalk.length == n
 * 1 <= n <= 10的5次方
 * 1 <= chalk[i] <= 10的5次方
 * 1 <= k <= 10的9次方
 */
public class ChalkReplacer {

    /**
     * 求得一轮需要使用的粉笔
     * 取余之后，再进行计算
     */
    public int chalkReplacer(int[] chalk, int k) {
        int length = chalk.length;
        long total = 0;
        for (int i : chalk) {
            total += i;
        }
        long left = k % total;
        int result = -1;
        for (int i = 0; i < length; i++) {
            int num = chalk[i];
            if (num > left) {
                result = i;
                break;
            }
            left -= num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {5,1,5};
        int l = 22;
        ChalkReplacer chalkReplacer = new ChalkReplacer();
        chalkReplacer.chalkReplacer(a, l);
    }

}
