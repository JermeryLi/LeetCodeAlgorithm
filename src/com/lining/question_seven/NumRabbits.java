package com.lining.question_seven;

import java.util.*;
import java.util.stream.Collectors;

/***
 * @author lining
 * @description
 * @create 2025/4/20 10:18
 * https://leetcode.cn/problems/rabbits-in-forest/?envType=daily-question&envId=2025-04-20
 * 781. 森林中的兔子
 * 森林中有未知数量的兔子。提问其中若干只兔子 "还有多少只兔子与你（指被提问的兔子）颜色相同?" ，
 * 将答案收集到一个整数数组 answers 中，其中 answers[i] 是第 i 只兔子的回答。
 *
 * 给你数组 answers ，返回森林中兔子的最少数量。
 *
 * 输入：answers = [1,1,2]
 * 输出：5
 * 解释：
 * 两只回答了 "1" 的兔子可能有相同的颜色，设为红色。
 * 之后回答了 "2" 的兔子不会是红色，否则他们的回答会相互矛盾。
 * 设回答了 "2" 的兔子为蓝色。
 * 此外，森林中还应有另外 2 只蓝色兔子的回答没有包含在数组中。
 * 因此森林中兔子的最少数量是 5 只：3 只回答的和 2 只没有回答的。
 **/
public class NumRabbits {
    public int numRabbits(int[] answers) {
        Arrays.sort(answers);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < answers.length; i++) {
            int answer = answers[i];
            count++;
            if(count > answer){
                count = 0;
                sum += answer + 1;
            }
            if(i == answers.length - 1 && count > 0     ){
                sum += answer + 1;
            }
        }
        return sum;
    }
}
