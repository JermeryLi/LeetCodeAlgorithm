package com.lining.question_twentythree;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lining
 * @Time 2023/12/11 13:30
 * https://leetcode.cn/problems/decode-the-message/
 * 2325. 解密消息
 * 给你字符串 key 和 message ，分别表示一个加密密钥和一段加密消息。解密 message 的步骤如下：
 * <p>
 * 使用 key 中 26 个英文小写字母第一次出现的顺序作为替换表中的字母 顺序 。
 * 将替换表与普通英文字母表对齐，形成对照表。
 * 按照对照表 替换 message 中的每个字母。
 * 空格 ' ' 保持不变。
 * 例如，key = "happy boy"（实际的加密密钥会包含字母表中每个字母 至少一次），据此，可以得到部分对照表（'h' -> 'a'、'a' -> 'b'、'p' -> 'c'、'y' -> 'd'、'b' -> 'e'、'o' -> 'f'）。
 * 返回解密后的消息。
 */
public class DecodeMessage {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> map = new HashMap<>();
        int count = 97;
        for (int i = 0; i < key.length(); i++) {
            if (map.size() == 26) {
                break;
            }
            char c = key.charAt(i);
            if (c == ' ') {
                continue;
            }
            if (!map.containsKey(c)) {
                map.put(c, (char) count);
                count++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            if(message.charAt(i) == ' '){
                sb.append(' ');
            }else{
                Character character = map.get(message.charAt(i));
                sb.append(character);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        DecodeMessage dm = new DecodeMessage();
        dm.decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv");
    }
}

/**
 * 输入：key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv"
 * 输出："this is a secret"
 * 解释：对照表如上图所示。
 * 提取 "the quick brown fox jumps over the lazy dog" 中每个字母的首次出现可以得到替换表。
 */
