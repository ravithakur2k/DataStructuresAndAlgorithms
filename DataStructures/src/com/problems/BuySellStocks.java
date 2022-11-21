package com.problems;

public class BuySellStocks {

    public static void main(String args[]) {
        System.out.println(optimizedProfitSoln(new int[]{7,2,5,3,1,4}));
    }

    public static int profit(int[] prices) {
        int max = 0;
        for (int p1 = 0; p1 < prices.length - 1; p1++) {
            int p2 = p1 + 1;
            while (p2 < prices.length) {
                int diff = prices[p2] - prices[p1];
                if (diff > max) max = diff;
                p2++;
            }
        }
        return max;
    }

    public static int optimizedProfitSoln(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min){
                min = prices[i];
            }

            if (prices[i] - min > profit) {
                profit = prices[i] - min;
            }
        }
        return profit;

    }
}
