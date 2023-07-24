package com.lining.question_twentythree;

/**
 * 描述：
 * https://leetcode.cn/problems/strictly-palindromic-number/
 *
 * @author lining
 * createTime 2023/7/4 18:39
 * lastModify
 * lastModifyTime
 * 小组
 * 2396. 严格回文的数字
 * 如果一个整数 n 在 b 进制下（b 为 2 到 n - 2 之间的所有整数）对应的字符串 全部 都是 回文的 ，那么我们称这个数 n 是 严格回文 的。
 * 给你一个整数 n ，如果 n 是 严格回文 的，请返回 true ，否则返回 false 。
 * 如果一个字符串从前往后读和从后往前读完全相同，那么这个字符串是 回文的 。
 *
 * 输入：n = 9
 * 输出：false
 * 解释：在 2 进制下：9 = 1001 ，是回文的。
 * 在 3 进制下：9 = 100 ，不是回文的。
 * 所以，9 不是严格回文数字，我们返回 false 。
 * 注意在 4, 5, 6 和 7 进制下，n = 9 都不是回文的。
 *
 * 输入：n = 4
 * 输出：false
 * 解释：我们只考虑 2 进制：4 = 100 ，不是回文的。
 * 所以我们返回 false 。
 */
public class IsStrictlyPalindromic {
    public boolean isStrictlyPalindromic(int n) {
        int maxB = n - 2;
        String string = "";
        for (int i = 2; i <= maxB; i++) {
            string = Integer.toString(n, i);
            if (!isPalindrome(string)) {
                return false;
            }
        }
        return true;
    }

    // 双指针移动判断字符是否是回文字符
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        IsStrictlyPalindromic isStrictlyPalindromic = new IsStrictlyPalindromic();
        System.out.println(isStrictlyPalindromic.isStrictlyPalindromic(4));
    }
}
