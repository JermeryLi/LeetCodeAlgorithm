package com.lining.question_six;

/**
 * @author lining
 * @date 2021/2/7 9:21
 * https://leetcode-cn.com/problems/non-decreasing-array/
 * 665. 非递减数列
 */
public class CheckPossibility {
    public boolean checkPossibility(int[] nums) {
        int n = nums.length, cnt = 0;
        for (int i = 0; i < n - 1; ++i) {
            int x = nums[i], y = nums[i + 1];
            if (x > y) {
                cnt++;
                if (cnt > 1) {
                    return false;
                }
                if (i > 0 && y < nums[i - 1]) {
                    nums[i + 1] = x;
                }
            }
        }
        return true;
    }
}
