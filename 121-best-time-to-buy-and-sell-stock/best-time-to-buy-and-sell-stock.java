class Solution {
    public int maxProfit(int[] prices) {
        // have to find the maximum profit
        // required two variables to comapre the profits
        int buy = prices[0]; // default 
        int maxprofit = 0;
        for (int i=0; i<prices.length; i++){
            if (prices[i] < buy){
                buy = prices[i]; // updating minimum price to but to increase the profit
            }
            else{
                int profit = prices[i] - buy; // calculate the profit
                maxprofit = Math.max(maxprofit, profit); // greedy - finding maximum profit
            }
        }
        return maxprofit;
    }
}