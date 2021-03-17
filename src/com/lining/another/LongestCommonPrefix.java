package com.lining.another;

/**
 * @author lining
 * @date 2021/3/4 10:23
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 */
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String prefix;
        int length = strs.length;
        if (length == 0) {
            prefix = "";
        } else {
            String indexOneStr = strs[0];
            if (length == 1) {
                prefix = indexOneStr;
            } else {
                prefix = "";
                int indexOneLength = indexOneStr.length();
                outer:
                for (int i = 1; i <= indexOneLength; i++) {
                    String substring = indexOneStr.substring(0, i);
                    for (int j = 1; j < length; j++) {
                        if (!strs[j].startsWith(substring)) {
                            break outer;
                        }
                    }
                    prefix = substring;
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flower", "flower", "flower"};
        System.out.println(longestCommonPrefix(strs));
    }

}
