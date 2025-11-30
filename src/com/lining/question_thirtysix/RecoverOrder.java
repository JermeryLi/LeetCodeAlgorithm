package com.lining.question_thirtysix;

import java.util.HashMap;
import java.util.Map;

/***
 * @author lining
 * @time 2025/11/30 20:45
 * https://leetcode.cn/problems/restore-finishing-order/
 * 3668. 重排完成顺序
 *
 * 给你一个长度为 n 的整数数组 order 和一个整数数组 friends。
 * order 包含从 1 到 n 的每个整数，且 恰好出现一次 ，表示比赛中参赛者按照 完成顺序 的ID。
 * friends 包含你朋友们的 ID，按照 严格递增 的顺序排列。friends 中的每个 ID 都保证出现在 order 数组中。
 * 请返回一个数组，包含你朋友们的 ID，按照他们的 完成顺序 排列。
 *
 * 示例 1：
 * 输入：order = [3,1,2,5,4], friends = [1,3,4]
 * 输出：[3,1,4]
 * 解释：
 * 完成顺序是 [3, 1, 2, 5, 4]。因此，你朋友的完成顺序是 [3, 1, 4]。
 *
 * 示例 2：
 * 输入：order = [1,4,5,3,2], friends = [2,5]
 * 输出：[5,2]
 * 解释：
 * 完成顺序是 [1, 4, 5, 3, 2]。因此，你朋友的完成顺序是 [5, 2]。
 *
 * 提示：
 * 1 <= n == order.length <= 100
 * order 包含从 1 到 n 的每个整数，且恰好出现一次
 * 1 <= friends.length <= min(8, n)
 * 1 <= friends[i] <= n
 * friends 是严格递增的
 **/
public class RecoverOrder {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] res = new int[friends.length];
        //将friends数组放入map中
        Map<Integer, Integer> friendsMap = new HashMap<>();
        for (int i = 0; i < friends.length; i++) {
            friendsMap.put(friends[i], i);
        }
        int index = 0;
        for (int i : order) {
            if (friendsMap.containsKey(i)) {
                res[index] = i;
                index++;
            }
        }
        return  res;
    }
}
