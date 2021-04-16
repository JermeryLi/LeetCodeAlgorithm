package com.lining.question_seventeen;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lining
 * @date 2021/4/15 8:51
 * 1704. 判断字符串的两半是否相似
 * https://leetcode-cn.com/problems/determine-if-string-halves-are-alike/
 * 给你一个偶数长度的字符串 s 。将其拆分成长度相同的两半，前一半为 a ，后一半为 b 。
 * 两个字符串 相似 的前提是它们都含有相同数目的元音（'a'，'e'，'i'，'o'，'u'，'A'，'E'，'I'，'O'，'U'）。注意，s 可能同时含有大写和小写字母。
 * 如果 a 和 b 相似，返回 true ；否则，返回 false 。
 */
public class HalvesAreAlike {
    public boolean halvesAreAlike(String s) {
        //暴力解法
        int length = s.length();
        String before = s.substring(0, length / 2);
        String after = s.substring(length / 2, length);
        Map<String, String> map = new HashMap<>();
        map.put("a", "1");
        map.put("e", "1");
        map.put("i", "1");
        map.put("o", "1");
        map.put("u", "1");
        map.put("A", "1");
        map.put("E", "1");
        map.put("I", "1");
        map.put("O", "1");
        map.put("U", "1");
        int beforeCount = 0;
        int afterCount = 0;
        for (int i = 0; i < length / 2; i++) {
            String beforeChar = String.valueOf(before.charAt(i));
            if (map.containsKey(beforeChar)) {
                beforeCount++;
            }
            String afterChar = String.valueOf(after.charAt(i));
            if (map.containsKey(afterChar)) {
                afterCount++;
            }
        }
        return beforeCount == afterCount;
    }
}
