class Solution {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length+1][2];
        for(int [] i : dp) Arrays.fill(i, -1);
        return helper(prices, 0, 1, dp);
    }
    public int helper(int [] prices, int index, int buy, int[][] dp) {
        if(index >= prices.length) return 0;
        if(dp[index][buy] != -1) return dp[index][buy];
        int profit =0;
        if(buy ==1) {
            int buyit = helper(prices, index+1, 0, dp) - prices[index];
            int skip = helper(prices, index+1, 1, dp);
            profit = Math.max(buyit, skip);
        }
        else {
            int sell = helper(prices, index+2, 1, dp) + prices[index];
            int skip = helper(prices, index+1, 0, dp);
            profit = Math.max(sell, skip);
        }
        return dp[index][buy] = profit;
    }
}