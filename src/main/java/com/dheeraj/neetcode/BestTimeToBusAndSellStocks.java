package com.dheeraj.neetcode;

import java.util.Arrays;
import java.util.stream.Stream;

public class BestTimeToBusAndSellStocks {

    public int maxProfit(int[] prices) {
        int[] rightHighValue = new int[prices.length];
        for (int i = prices.length - 1; i >= 0; i--) {
            if (i == prices.length - 1) {
                rightHighValue[i] = prices[i];
            } else {
                rightHighValue[i] = Math.max(rightHighValue[i + 1], prices[i]);
            }
        }
        int[] profits = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            profits[i] = rightHighValue[i] - prices[i];
        }

        return Arrays.stream(profits).max().getAsInt();

    }

    public static void main(String[] args) {
        BestTimeToBusAndSellStocks time = new BestTimeToBusAndSellStocks();
        int[] prices = {10,1,5,6,7,1};
        System.out.println(time.maxProfit(prices));
    }
}
