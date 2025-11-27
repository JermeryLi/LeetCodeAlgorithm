package com.lining.question_thirtyfive;

/***
 * @author lining
 * @time 2025/11/26 23:32
 *
 * https://leetcode.cn/problems/find-most-frequent-vowel-and-consonant/
 * 3541. 找到频率最高的元音和辅音
 * 给你一个由小写英文字母（'a' 到 'z'）组成的字符串 s。
 * 你的任务是找出出现频率最高的元音（'a'、'e'、'i'、'o'、'u' 中的一个）和出现频率最高的辅音（除元音以外的所有字母），并返回这两个频数之和。
 * 注意：如果有多个元音或辅音具有相同的最高频率，可以任选其中一个。如果字符串中没有元音或没有辅音，则其频率视为 0。
 * 一个字母 x 的 频率 是它在字符串中出现的次数。
 *
 *  示例 1：
 * 输入: s = "successes"
 * 输出: 6
 * 解释:
 * 元音有：'u' 出现 1 次，'e' 出现 2 次。最大元音频率 = 2。
 * 辅音有：'s' 出现 4 次，'c' 出现 2 次。最大辅音频率 = 4。
 * 输出为 2 + 4 = 6。
 *
 *示例 2：
 * 输入: s = "aeiaeia"
 * 输出: 3
 * 解释:
 * 元音有：'a' 出现 3 次，'e' 出现 2 次，'i' 出现 2 次。最大元音频率 = 3。
 * s 中没有辅音。因此，最大辅音频率 = 0。
 * 输出为 3 + 0 = 3。
 *
 * 提示
 * 1 <= s.length <= 100
 * s 只包含小写英文字母
 **/
public class MaxFreqSum {
    public int maxFreqSum(String s) {
        //定义字母个数常数
        int wordsNum = 26;
        // 创建长度为26的数组，用于统计每个字母出现的次数
        int[] cnt = new int[wordsNum];
        // 遍历字符串中的每个字符
        for (char c : s.toCharArray()) {
            // 将字符转换为数组索引（'a'对应0，'b'对应1...），并增加该字母的计数
            cnt[c - 'a']++;
        }

        int maxVowelFreq = 0;
        maxVowelFreq = Math.max(maxVowelFreq, cnt['a' - 'a']);
        maxVowelFreq = Math.max(maxVowelFreq, cnt['e' - 'a']);
        maxVowelFreq = Math.max(maxVowelFreq, cnt['i' - 'a']);
        maxVowelFreq = Math.max(maxVowelFreq, cnt['o' - 'a']);
        maxVowelFreq = Math.max(maxVowelFreq, cnt['u' - 'a']);

        int maxConsonantFreq = 0;
        for (int i = 0; i < wordsNum; i++) {
            char c = (char) ('a' + i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                continue;
            }
            maxConsonantFreq = Math.max(maxConsonantFreq, cnt[i]);
        }

        // 返回元音最高频率和辅音最高频率的和
        return maxVowelFreq + maxConsonantFreq;
    }
}
