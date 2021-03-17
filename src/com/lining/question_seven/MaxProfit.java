package com.lining.question_seven;

/**
 * @author lining
 * @date 2020/12/17 9:46
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/
 * 714. 买卖股票的最佳时机含手续费
 * <p>
 * arr[i][0]
 * //手里没有股票
 * 有可能今天卖出 (前一天手里有股票 收益：前一天手里有股票的收益 + 今天的股价 - 手续费 )
 * 有可能前一天卖出 （前一天手里没有股票  收益： 前一天手里有股票的收益）
 * arr[i][1]
 * //手里有股票
 * 有可能今天买的（前一天手里没有股票 收益为 前一天手里没有股票的收益 - 今天的股价）
 * 有可能前一天买的（前一天有股票  收益为 前一天手里有股票的收益）
 */
public class MaxProfit {
    public static int maxProfit(int[] prices, int fee) {
        int[][] arr = new int[prices.length][2];
        arr[0][0] = 0;
        arr[0][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            arr[i][0] = Math.max(arr[i - 1][1] + prices[i] - fee, arr[i - 1][0]);
            arr[i][1] = Math.max(arr[i - 1][0] - prices[i], arr[i - 1][1]);
        }
        return arr[prices.length - 1][0];
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 8, 4, 9};
        System.out.println(maxProfit(arr, 2));
    }
}
