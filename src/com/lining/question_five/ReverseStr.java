package com.lining.question_five;

/**
 * 描述：
 * https://leetcode.cn/problems/reverse-string-ii/
 *
 * @author lining
 * createTime 2023/3/20 19:06
 * 给定一个字符串 s 和一个整数 k，从字符串开头算起，每计数至 2k 个字符，就反转这 2k 字符中的前 k 个字符。
 * 如果剩余字符少于 k 个，则将剩余字符全部反转。
 * 如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
 *
 * 输入：s = "abcdefg", k = 2
 * 输出："bacdfeg"
 *
 * 输入：s = "abcd", k = 2
 * 输出："bacd"
 *
 * 1 <= s.length <= 10的4次方
 * s 仅由小写英文组成
 * 1 <= k <= 10的4次方
 */
public class ReverseStr {
    public String reverseStr(String s, int k) {
        int doubleK = 2 * k;
        int length = s.length();
        int i = length / doubleK;
        int i1 = length % doubleK;
        int lengthLeft = length;
        // 循环次数
        int count = 1;
        StringBuffer sb = new StringBuffer();
        while (lengthLeft >= doubleK) {
            // 取2k个字符，并翻转前k个字符
            int start = (count - 1) * doubleK;
            int middle = (count - 1) * doubleK + k;
            int end = count * doubleK;
            // 获得前k个字符
            String frontK = s.substring(start, middle);
            StringBuffer sb2 = new StringBuffer(frontK);
            sb.append(sb2.reverse());
            String behindK = s.substring(middle, end);
            sb.append(behindK);
            // 获得后k个字符
            lengthLeft = lengthLeft - doubleK;
        }
        return s;
    }

    public static void main(String[] args) {
        ReverseStr reverseStr = new ReverseStr();
        reverseStr.reverseStr("abcdefg", 2);
        System.out.println("lining");
    }
}
