package com.lining.question_fifteen;

/**
 * @author lining
 * @date 2021/4/16 9:33
 * 1534. 统计好三元组
 * https://leetcode-cn.com/problems/count-good-triplets/
 * 给你一个整数数组 arr ，以及 a、b 、c 三个整数。请你统计其中好三元组的数量。
 * 如果三元组 (arr[i], arr[j], arr[k]) 满足下列全部条件，则认为它是一个 好三元组 。
 * 0 <= i < j < k < arr.length
 * |arr[i] - arr[j]| <= a
 * |arr[j] - arr[k]| <= b
 * |arr[i] - arr[k]| <= c
 * 其中 |x| 表示 x 的绝对值。
 * 返回 好三元组的数量 。
 * 输入：arr = [3,0,1,1,9,7], a = 7, b = 2, c = 3
 * 输出：4
 * 解释：一共有 4 个好三元组：[(3,0,1), (3,0,1), (3,1,1), (0,1,1)] 。
 * <p>
 * 3 <= arr.length <= 100
 * 0 <= arr[i] <= 1000  ·
 * 0 <= a, b, c <= 1000
 */
public class CountGoodTriplets {
    //尝试使用暴力方法
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int arrLength = arr.length;
        int count = 0;
        int one, two, three;
        for (int i = 0; i < arrLength - 2; i++) {
            for (int j = i + 1; j < arrLength - 1; j++) {
                one = arr[i];
                two = arr[j];
                if (Math.abs(one - two) <= a) {
                    for (int k = j + 1; k < arrLength; k++) {
                        three = arr[k];
                        if (Math.abs(two - three) <= b && Math.abs(one - three) <= c) {
                            count++;
                        }
                    }
                }

            }
        }
        return count;
    }


}
