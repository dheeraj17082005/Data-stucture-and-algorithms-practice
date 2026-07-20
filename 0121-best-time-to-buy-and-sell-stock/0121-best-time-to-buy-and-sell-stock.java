class Solution {
    public int maxProfit(int[] prices) {
     int minimum = prices[0];
     int maxProfit = Integer.MIN_VALUE;
     int n = prices.length;

     for(int i = 0; i < n; i++){
        int cost = prices[i] - minimum;

        maxProfit = Math.max(cost,maxProfit);
        minimum = Math.min(prices[i],minimum);
     }
     return maxProfit;

    }
}