package com.lining.question_eight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lining
 * @date 2021/1/5 9:08
 * https://leetcode-cn.com/problems/positions-of-large-groups/
 * 830. 较大分组的位置
 * 在一个由小写字母构成的字符串 s 中，包含由一些连续的相同字符所构成的分组。
 * 例如，在字符串 s = "abbxxxxzyy" 中，就含有 "a", "bb", "xxxx", "z" 和 "yy" 这样的一些分组。
 * 分组可以用区间 [start, end] 表示，其中 start 和 end 分别表示该分组的起始和终止位置的下标。上例中的 "xxxx" 分组用区间表示为 [3,6] 。
 * 我们称所有包含大于或等于三个连续字符的分组为 较大分组 。
 * 找到每一个 较大分组 的区间，按起始位置下标递增顺序排序后，返回结果。
 */
public class LargeGroupPositions {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> list = new ArrayList<>();
        char[] chars = s.toCharArray();
        int start = 0;
        int end = 0;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                end = i;
                if (i == chars.length - 1 && end - start >= 2) {
                    list.add(Arrays.asList(start, end));
                }
            } else {
                if (end - start >= 2) {
                    list.add(Arrays.asList(start, end));
                }
                start = i;
                end = i;
            }
        }
        return list;
    }
}
