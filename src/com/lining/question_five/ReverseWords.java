package com.lining.question_five;

/**
 * 描述：
 * https://leetcode.cn/problems/reverse-words-in-a-string-iii/
 *
 * @author lining
 * createTime 2023/4/27 16:53
 * lastModify
 * lastModifyTime
 * 小组
 */
public class ReverseWords {
    public String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuffer sb = new StringBuffer();
        StringBuffer sb2;
        for (String string : strings) {
            sb2 = new StringBuffer(string);
            StringBuffer reverse = sb2.reverse();
            sb.append(reverse);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
