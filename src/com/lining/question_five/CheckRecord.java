package com.lining.question_five;

/**
 * @author lining
 * @date 2021/1/5 10:20
 * https://leetcode-cn.com/problems/student-attendance-record-i/
 * 551. 学生出勤记录 I
 * 给定一个字符串来代表一个学生的出勤记录，这个记录仅包含以下三个字符：
 * <p>
 * 'A' : Absent，缺勤
 * 'L' : Late，迟到
 * 'P' : Present，到场
 * 如果一个学生的出勤记录中不超过一个'A'(缺勤)并且不超过两个连续的'L'(迟到),那么这个学生会被奖赏。
 * 你需要根据这个学生的出勤记录判断他是否会被奖赏
 */
public class CheckRecord {
    public boolean checkRecord(String s) {
        String pattern = "LLL";
        if (s.contains(pattern)) {
            return false;
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A') {
                count++;
                if (count > 1) {
                    return false;
                }
            }
        }
        return true;
    }


}