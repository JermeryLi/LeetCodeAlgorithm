package com.lining.question_twentyfour;

/**
 * @author lining
 * @Time 2023/12/12 8:55
 * https://leetcode.cn/problems/find-the-original-array-of-prefix-xor/
 * 2433. 找出前缀异或的原始数组
 * 给你一个长度为 n 的 整数 数组 pref 。找出并返回满足下述条件且长度为 n 的数组 arr ：
 * <p>
 * pref[i] = arr[0] ^ arr[1] ^ ... ^ arr[i].
 * 注意 ^ 表示 按位异或（bitwise-xor）运算。
 * <p>
 * 可以证明答案是 唯一 的。
 */
public class FindArray {
    public int[] findArray(int[] pref) {
        int[] arr = new int[pref.length];
        arr[0] = pref[0];
        for (int i = 1; i < pref.length; i++) {
            arr[i] = pref[i] ^ pref[i - 1];
        }
        return arr;
    }
}
