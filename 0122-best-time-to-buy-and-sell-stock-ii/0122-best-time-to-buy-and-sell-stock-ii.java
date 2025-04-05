class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(prices == null || n <= 1){
            return 0;
        }
        int maxBuy = -prices[0];
        int maxSell = 0;
        int result = 0;
        for(int i = 1; i < n; i++){
            int tempBuy = maxSell - prices[i];
            int tempSell = maxBuy  + prices[i];

            if(tempBuy > maxBuy){
                maxBuy = tempBuy;
            }
            if(tempSell > maxSell){
                maxSell = tempSell;
            }
        }
        return Math.max(maxSell, maxBuy);
    }
}