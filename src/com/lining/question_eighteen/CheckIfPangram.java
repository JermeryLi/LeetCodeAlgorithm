package com.lining.question_eighteen;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lining
 * @date 2021/4/26 13:18
 * 1832. 判断句子是否为全字母句
 * https://leetcode-cn.com/problems/check-if-the-sentence-is-pangram/
 * 全字母句 指包含英语字母表中每个字母至少一次的句子。
 * 给你一个仅由小写英文字母组成的字符串 sentence ，请你判断 sentence 是否为 全字母句 。
 * 如果是，返回 true ；否则，返回 false 。
 */
public class CheckIfPangram {
    public boolean checkIfPangram(String sentence) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < sentence.length(); i++) {
            map.put(String.valueOf(sentence.charAt(i)), "0");
        }
        return map.size() == 26;
    }

    public boolean checkIfPangram2(String sentence) {
        int length = sentence.length();
        if (length < 26) {
            return false;
        }
        char[] chars = new char[length];
        for (int i = 0; i < length; i++) {
            chars[i] = sentence.charAt(i);
        }
        Arrays.sort(chars);
        if (chars[0] != 'a' || chars[length - 1] != 'z') {
            return false;
        }
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] - chars[i - 1] > 1) {
                return false;
            }
        }
        return true;
    }

}
