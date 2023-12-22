package com.lining.question_twentyone;

/**
 * @author lining
 * @Time 2023/12/22 8:50
 * https://leetcode.cn/problems/maximum-number-of-words-found-in-sentences/
 * 2114. 句子中的最多单词数
 * 一个 句子 由一些 单词 以及它们之间的单个空格组成，句子的开头和结尾不会有多余空格。
 *
 * 给你一个字符串数组 sentences ，其中 sentences[i] 表示单个 句子 。
 *
 * 请你返回单个句子里 单词的最多数目 。
 */
public class MostWordsFound {
    public int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        for (String sentence : sentences) {
            String[] split = sentence.split(" ");
            max = Math.max(max, split.length);
        }
        return max;
    }
}
