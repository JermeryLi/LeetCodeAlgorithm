package com.lining.question_seven;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lining
 * @date 2021/4/7 9:01
 * 771. 宝石与石头
 * https://leetcode-cn.com/problems/jewels-and-stones/
 *  给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 
 * S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 * 输入: J = "aA", S = "aAAbbbb"
 * 输出: 3
 * 输入: J = "z", S = "ZZ"
 * 输出: 0
 */
public class NumJewelsInStones {
    /**
     * 我的代码
     * 思路：  将石头转成char数组后排序 再转成String。
     * 遍历宝石，通过indexOf()和lastIndexOf() 确定每一个宝石的个数
     * 暴力方法  可以优化的地方 没必要转数组 可以直接遍历String chatAt()
     *
     * @param jewels 石头中宝石的类型
     * @param stones 拥有的石头
     * @return 石头中宝石的个数
     */
    public int numJewelsInStones(String jewels, String stones) {
        char[] stonesChar = stones.toCharArray();
        Arrays.sort(stonesChar);
        stones = String.copyValueOf(stonesChar);
        char[] jewelsChars = jewels.toCharArray();
        int length = jewelsChars.length;
        int num = 0;
        for (int i = 0; i < length; i++) {
            char c = jewelsChars[i];
            int index = stones.indexOf(c);
            if (index < 0) {
                continue;
            } else {
                int lastIndex = stones.lastIndexOf(c);
                num += (lastIndex - index + 1);
            }
        }
        return num;
    }


    /**
     * 方法一中，对于字符串 stones 中的每个字符，都需要遍历一次字符串 jewels，导致时间复杂度较高。
     * 如果使用哈希集合存储字符串 jewels 中的宝石，则可以降低判断的时间复杂度。
     * 遍历字符串 jewels，使用哈希集合存储其中的字符，然后遍历字符串 stones，对于其中的每个字符，如果其在哈希集合中，则是宝石。
     * 哈希表构造以及对象的构造和析构需要时间，数据量太少体现不出优势。
     */
    public int numJewelsInStones2(String jewels, String stones) {
        int num = 0;
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < jewels.length(); i++) {
            map.put(String.valueOf(jewels.charAt(i)), "1");
        }
        for (int i = 0; i < stones.length(); i++) {
            String key = String.valueOf(stones.charAt(i));
            if (map.containsKey(key)) {
                num++;
            }
        }
        return num;
    }


    public int numJewelsInStone3(String J, String S) {
        int len = J.length();
        int[] type = new int[256];
        for(int i = 0; i < len; i++){
            type[J.charAt(i)] = 1;
        }
        int ans = 0;
        len = S.length();
        for(int i = 0; i < len; i++){
            ans += type[S.charAt(i)];
        }
        return ans;
    }


}
