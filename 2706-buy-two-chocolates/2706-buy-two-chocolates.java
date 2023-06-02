class Solution {
    public int buyChoco(int[] prices, int money) {
        int a=0;
        Arrays.sort(prices);
        if(prices[0] + prices[1] > money) { return money; }
        else { return (money - prices[0] - prices[1]); }
    }
}