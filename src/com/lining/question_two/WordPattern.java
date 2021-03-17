package com.lining.question_two;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lining
 * @date 2020/12/16 8:47
 * https://leetcode-cn.com/problems/word-pattern/
 * 290. 单词规律
 * 给定一种规律 pattern 和一个字符串 str ，判断 str 是否遵循相同的规律。
 * 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律。
 */
public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        char[] chars = pattern.toCharArray();
        String[] strArr = s.split(" ");
        if (chars.length != strArr.length) {
            return false;
        }
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            String key = String.valueOf(chars[i]);
            if (map.containsKey(key)) {
                if (!map.get(key).equals(strArr[i])) {
                    return false;
                }
            } else {
                if (map.containsValue(strArr[i])) {
                    return false;
                }
                map.put(key, strArr[i]);
            }
        }
        return true;
    }

}
