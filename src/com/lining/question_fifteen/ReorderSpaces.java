package com.lining.question_fifteen;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：
 * 给你一个字符串 text ，该字符串由若干被空格包围的单词组成。
 * 每个单词由一个或者多个小写英文字母组成，并且两个单词之间至少存在一个空格。题目测试用例保证 text 至少包含一个单词 。
 * 请你重新排列空格，使每对相邻单词之间的空格数目都 相等 ，并尽可能 最大化 该数目。
 * 如果不能重新平均分配所有空格，请 将多余的空格放置在字符串末尾 ，这也意味着返回的字符串应当与原 text 字符串的长度相等。
 * 返回 重新排列空格后的字符串 。
 *
 * @author lining
 * createTime 2023/3/19 19:57
 * <p>
 * "  this   is  a sentence "
 */
public class ReorderSpaces {
    public String reorderSpaces(String text) {
        // 空格个数
        int spaceCounts = 0;
        List<StringBuffer> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        int length = text.length();
        // 一次遍历 拿到单词个数和空格个数、单词内容
        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                spaceCounts++;
            } else {
                if (i == 0) {
                    sb = new StringBuffer();
                    list.add(sb);
                } else {
                    if (text.charAt(i - 1) == ' ') {
                        sb = new StringBuffer();
                        list.add(sb);
                    }
                }
                sb.append(c);
            }
        }
        if (spaceCounts == 0) {
            return text;
        }
        System.out.println("空格数" + spaceCounts);
        // 单词个数
        int wordCounts = list.size();
        System.out.println("单词个数" + wordCounts);
        if (wordCounts == 1) {
            sb = new StringBuffer();
            sb.append(list.get(0));
            for (int i = 0; i < spaceCounts; i++) {
                sb.append(' ');
            }
            return sb.toString();
        }
        //每两个单词之间的空格个数
        int spaceCountBetweenWords = spaceCounts / (wordCounts - 1);
        System.out.println("每两个单词之间的空格个数" + spaceCountBetweenWords);
        int spaceCountLeft = spaceCounts % (wordCounts - 1);
        System.out.println("多余的空格数" + spaceCountLeft);
        sb = new StringBuffer();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i != list.size() - 1) {
                for (int i1 = 0; i1 < spaceCountBetweenWords; i1++) {
                    sb.append(' ');
                }
            } else {
                if (spaceCountLeft != 0) {
                    for (int j = 0; j < spaceCountLeft; j++) {
                        sb.append(' ');
                    }
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ReorderSpaces reorderSpaces = new ReorderSpaces();
        System.out.println(reorderSpaces.reorderSpaces(" practice   makes   perfect"));

    }
}
