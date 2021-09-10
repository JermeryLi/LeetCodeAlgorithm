package com.lining.question_twelve;

/**
 * @author lining
 * @date 2021/9/7 10:22
 * 1299. 将每个元素替换为右侧最大元素
 * 给你一个数组 arr ，请你将每个元素用它右边最大的元素替换，如果是最后一个元素，用 -1 替换。
 * 完成所有替换操作后，请你返回这个数组。
 * <p>
 * https://leetcode-cn.com/problems/replace-elements-with-greatest-element-on-right-side/
 */
public class ReplaceElements {
    public int[] replaceElements(int[] arr) {
        int length = arr.length;
        int max = arr[length - 1];
        for (int i = length - 1; i >= 0; i--) {
            int i1 = arr[i];
            if (i == length - 1) {
                arr[i] = -1;
            } else {
                arr[i] = max;
            }
            if (max < i1) {
                max = i1;
            }
        }
        return arr;
    }
}
