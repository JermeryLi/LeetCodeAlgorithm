package com.lining.question_twentyeight;

import java.util.List;

/**
 * @author lining
 * @Time 2023/12/20 15:51
 */
public class IsAcronym {
    public boolean isAcronym(List<String> words, String s) {
        int size = words.size();
        if (size != s.length()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (words.get(i).charAt(0) != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
