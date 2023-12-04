package com.lining.question_twentynine;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lining
 * https://leetcode.cn/problems/find-words-containing-character/
 * 2942. 查找包含给定字符的单词
 * 给你一个下标从 0 开始的字符串数组 words 和一个字符 x 。
 * 请你返回一个 下标数组 ，表示下标在数组中对应的单词包含字符 x 。
 * 注意 ，返回的数组可以是 任意 顺序。
 * 输入：words = ["leet","code"], x = "e"
 * 输出：[0,1]
 * 解释："e" 在两个单词中都出现了："leet" 和 "code" 。所以我们返回下标 0 和 1 。
 */
public class FindWordsContaining {
    /**
     * 解题思路：遍历数组，判断数组字符串是否包含字符。如果包含，则将字符串下标加入列表中。
     *
     * @param words 字符串数组
     * @param x     字符
     * @return 包含给定字符的单词的下标
     */
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                list.add(i);
            }
//            contains可以使用indexOf代替
//            if (words[i].contains(String.valueOf(x))) {
//                list.add(i);
//            }
        }
        return list;
    }
}
