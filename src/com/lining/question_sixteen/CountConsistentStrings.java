package com.lining.question_sixteen;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lining
 * @date 2021/4/8 9:29
 * 1684. 统计一致字符串的数目
 * https://leetcode-cn.com/problems/count-the-number-of-consistent-strings/
 * 给你一个由不同字符组成的字符串 allowed 和一个字符串数组 words 。如果一个字符串的每一个字符都在 allowed 中，就称这个字符串是 一致字符串 。
 * 请你返回 words 数组中 一致字符串 的数目。
 * 输入：allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
 * 输出：2
 * 解释：字符串 "aaab" 和 "baa" 都是一致字符串，因为它们只包含字符 'a' 和 'b' 。
 */
public class CountConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        Map<String, String> map = new HashMap<>();
        int allowedLength = allowed.length();
        for (int i = 0; i < allowedLength; i++) {
            String word = String.valueOf(allowed.charAt(i));
            map.put(word, "1");
        }
        int count = 0;
        out:
        for (String word : words) {
            int wordLength = word.length();
            for (int j = 0; j < wordLength; j++) {
                String character = String.valueOf(word.charAt(j));
                if (!map.containsKey(character)) {
                    continue out;
                }
            }
            count++;
        }
        return count;
    }
}
