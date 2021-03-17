package com.lining.question_eleven;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lining
 * @date 2021/2/26 8:57
 * https://leetcode-cn.com/problems/number-of-valid-words-for-each-puzzle/
 * <p>
 * 1178. 猜字谜
 * 外国友人仿照中国字谜设计了一个英文版猜字谜小游戏，请你来猜猜看吧。
 * <p>
 * 字谜的迷面 puzzle 按字符串形式给出，如果一个单词 word 符合下面两个条件，那么它就可以算作谜底：
 * <p>
 * 单词 word 中包含谜面 puzzle 的第一个字母。
 * 单词 word 中的每一个字母都可以在谜面 puzzle 中找到。
 * 例如，如果字谜的谜面是 "abcdefg"，那么可以作为谜底的单词有 "faced", "cabbage", 和 "baggage"；而 "beefed"（不含字母 "a"）以及 "based"（其中的 "s" 没有出现在谜面中）。
 * 返回一个答案数组 answer，数组中的每个元素 answer[i] 是在给出的单词列表 words 中可以作为字谜迷面 puzzles[i] 所对应的谜底的单词数目。
 * <p>
 * 输入：
 * words = ["aaaa","asas","able","ability","actt","actor","access"],
 * puzzles = ["aboveyz","abrodyz","abslute","absoryz","actresz","gaswxyz"]
 * 输出：[1,1,3,2,4,0]
 * 解释：
 * 1 个单词可以作为 "aboveyz" 的谜底 : "aaaa"
 * 1 个单词可以作为 "abrodyz" 的谜底 : "aaaa"
 * 3 个单词可以作为 "abslute" 的谜底 : "aaaa", "asas", "able"
 * 2 个单词可以作为 "absoryz" 的谜底 : "aaaa", "asas"
 * 4 个单词可以作为 "actresz" 的谜底 : "aaaa", "asas", "actt", "access"
 * 没有单词可以作为 "gaswxyz" 的谜底，因为列表中的单词都不含字母 'g'。
 */
public class FindNumOfValidWords {
    //这种方法 超出时间限制
    public static List<Integer> findNumOfValidWords2(String[] words, String[] puzzles) {
        List<Integer> list = new ArrayList<>();
        for (String puzzle : puzzles) {
            int count = 0;
            char first = puzzle.charAt(0);
            for (String word : words) {
                if (word.indexOf(first) < 0) {
                    continue;
                }
                boolean flag = true;
                for (int j = 0; j < word.length(); j++) {
                    char c = word.charAt(j);
                    if (puzzle.indexOf(c) < 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    count++;
                }
            }
            list.add(count);
        }
        return list;
    }
}
