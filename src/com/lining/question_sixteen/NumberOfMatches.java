package com.lining.question_sixteen;

/**
 * @author lining
 * @date 2021/1/5 13:23
 * 1688. 比赛中的配对次数
 * https://leetcode-cn.com/problems/count-of-matches-in-tournament/
 * 给你一个整数 n ，表示比赛中的队伍数。比赛遵循一种独特的赛制：
 * 如果当前队伍数是 偶数 ，那么每支队伍都会与另一支队伍配对。总共进行 n / 2 场比赛，且产生 n / 2 支队伍进入下一轮。
 * 如果当前队伍数为 奇数 ，那么将会随机轮空并晋级一支队伍，其余的队伍配对。总共进行 (n - 1) / 2 场比赛，且产生 (n - 1) / 2 + 1 支队伍进入下一轮。
 * 返回在比赛中进行的配对次数，直到决出获胜队伍为止。
 */
public class NumberOfMatches {
    public int numberOfMatches(int n) {
        int count = 0;
        while (n > 1) {
            count += (n % 2 != 0 ? n / 2 + 1 : n / 2);
            n /= 2;
        }
        return count;
    }
}
