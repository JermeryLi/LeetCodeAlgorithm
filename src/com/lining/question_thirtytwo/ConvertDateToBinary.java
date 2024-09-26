package com.lining.question_thirtytwo;

/***
 * @author lining
 * @description
 * @create 2024/9/25 10:16
 * https://leetcode.cn/problems/convert-date-to-binary/description/
 * 3280. 将日期转换为二进制表示
 * 给你一个字符串 date，它的格式为 yyyy-mm-dd，表示一个公历日期。
 * date 可以重写为二进制表示，只需要将年、月、日分别转换为对应的二进制表示（不带前导零）并遵循 year-month-day 的格式。
 * 返回 date 的 二进制 表示。
 **/
public class ConvertDateToBinary {
    public String convertDateToBinary(String date) {
        StringBuilder sb = new StringBuilder();
        String[] split = date.split("-");
        for (int i = 0; i < split.length; i++) {
            String s = split[i];
            sb.append(Integer.toBinaryString(Integer.parseInt(s)));
            if (i != split.length - 1) {
                sb.append("-");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int decimalNumber = 2;
        // 转换为二进制字符串
        String binaryString = Integer.toBinaryString(decimalNumber);
        // 打印结果
        System.out.println("十进制数 " + decimalNumber + " 的二进制表示为: " + binaryString);

        String date = "2080-02-29";
        String[] split = date.split("-");
        for (String s : split) {
            System.out.println(Integer.toBinaryString(Integer.valueOf(s)));
        }
    }
}
