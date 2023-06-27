class Solution {
    public int maxProfit(int[] prices) {
        int s=0, e=1, max=0;
        while(e < prices.length) {
            if(prices[s] > prices[e]) { s = e; }
            else if(prices[s] < prices[e]) { 
                max = Math.max(max, (prices[e] - prices[s]));
            }
            e++;
        }
        return max;
    }
}