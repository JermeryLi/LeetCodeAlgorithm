package com.lining.question_thirtytwo;

import java.util.ArrayList;
import java.util.List;

/***
 * @author lining
 * @time 2025/12/11 21:28
 * https://leetcode.cn/problems/generate-binary-strings-without-adjacent-zeros/
 * 3211. 生成不含相邻零的二进制字符串
 * 给你一个正整数 n。
 * 如果一个二进制字符串 x 的所有长度为 2 的子字符串中包含 至少 一个 "1"，则称 x 是一个 有效 字符串。
 * 返回所有长度为 n 的 有效 字符串，可以以任意顺序排列。
 *
 * 示例 1：
 * 输入： n = 3
 * 输出： ["010","011","101","110","111"]
 * 解释：
 * 长度为 3 的有效字符串有："010"、"011"、"101"、"110" 和 "111"。
 *
 * 示例 2：
 * 输入： n = 1
 * 输出： ["0","1"]
 * 解释：
 * 长度为 1 的有效字符串有："0" 和 "1"。
 * 提示：
 * 1 <= n <= 18
 **/
public class ValidStrings {
    List<String> res = new ArrayList<String>();
    int n;

    public List<String> validStrings(int n) {
        this.n = n;
        dfs(new StringBuilder());
        return res;
    }

    public void dfs(StringBuilder sb) {
        if (sb.length() == n) {
            res.add(sb.toString());
        } else {
            if (sb.length() == 0 || sb.charAt(sb.length() - 1) == '1') {
                sb.append('0');
                dfs(sb);
                sb.setLength(sb.length() - 1);
            }
            sb.append('1');
            dfs(sb);
            sb.setLength(sb.length() - 1);
        }
    }
}
