package com.lining.question_three;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lining
 * @date 2020/12/23 8:47
 * https://leetcode-cn.com/problems/first-unique-character-in-a-string/
 * 387. 字符串中的第一个唯一字符
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * s = "leetcode"  返回 0
 * s = "loveleetcode" 返回 2
 */
public class FirstUniqChar {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (s.indexOf(chars[i]) == s.lastIndexOf(chars[i])) {
                return i;
            }
        }
        return -1;
    }


    /**
     * 使用哈希表存储频数
     */
    public int firstUniqChar2(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (1 == map.get(s.charAt(i))) {
                return i;
            }
        }
        return -1;
    }
    /**
     * 使用哈希表存储索引
     */
    public int firstUniqChar3(String s) {
        Map<Character, Integer> position = new HashMap<>();
        //key为字符  值为索引（不重复）或-1（重复的）
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char a = s.charAt(i);
            if (position.containsKey(a)) {
                //重复的字符值设为-1
                position.put(a, -1);
            } else {
                position.put(a, i);
            }
        }
        int first = length;
        for (Map.Entry<Character, Integer> entry : position.entrySet()) {
            Integer value = entry.getValue();
            if (value != -1 && first > value) {
                first = value;
            }
        }
        if (first == length) {
            first = -1;
        }
        return first;
    }

}
