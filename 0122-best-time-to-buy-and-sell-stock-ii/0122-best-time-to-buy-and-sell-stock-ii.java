class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int [][] dp = new int[n+1][2];
        for(int [] i : dp) { Arrays.fill(i, -1); }
        
        dp[n][0] = dp[n][1] = 0;
        int profit=0;
        
        for(int i=n-1; i>=0; i--) {
            for(int buy=0; buy <= 1; buy++) {
                if(buy == 0) {
                    profit = Math.max(0+dp[i+1][0] , dp[i+1][1] - prices[i]);
                }
                else if(buy == 1){
                    profit = Math.max(0+dp[i+1][1] , dp[i+1][0] + prices[i]);
                }
                dp[i][buy] = profit;
            }
        }
        return dp[0][0];
    }
}