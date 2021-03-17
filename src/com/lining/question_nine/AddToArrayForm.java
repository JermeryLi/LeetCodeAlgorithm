package com.lining.question_nine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author lining
 * @date 2021/1/22 9:01
 * https://leetcode-cn.com/problems/add-to-array-form-of-integer/
 * 989. 数组形式的整数加法
 * 输入：A = [1,2,0,0], K = 34
 * 输出：[1,2,3,4]
 * 解释：1200 + 34 = 1234
 */
public class AddToArrayForm {
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> res = new ArrayList<Integer>();
        int n = A.length;
        for (int i = n - 1; i >= 0; --i) {
            int sum = A[i] + K % 10;
            K /= 10;
            if (sum >= 10) {
                K++;
                sum -= 10;
            }
            res.add(sum);
        }
        for (; K > 0; K /= 10) {
            res.add(K % 10);
        }
        Collections.reverse(res);
        return res;
    }
}
