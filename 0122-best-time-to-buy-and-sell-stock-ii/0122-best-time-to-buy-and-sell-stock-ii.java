class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(prices == null || n <= 1){
            return 0;
        }
        // int[][] profitEachDay = new int[n][2];
        // profitEachDay[0][0] = -prices[0];
        // profitEachDay[0][1] = 0;
        int maxBuy = -prices[0];
        int maxSell = 0;
        int result = 0;
        for(int i = 1; i < n; i++){
            // profitEachDay[i][0] = Math.max(-prices[i], profitEachDay[i-1][1] - prices[i]);
            int tempBuy = maxSell - prices[i];
            int tempSell = maxBuy  + prices[i];

            if(tempBuy > maxBuy){
                maxBuy = tempBuy;
            }
            if(tempSell > maxSell){
                maxSell = tempSell;
            }
            // if (profitEachDay[i][0] < leastBuyingPrice){
            //     leastBuyingPrice = profitEachDay[i][0];
            // }
            // else {
            //     profitEachDay[i][0] = leastBuyingPrice;
            // }

            // profitEachDay[i][1] = profitEachDay[i - 1][0] + prices[i];
            // if (profitEachDay[i][1] > maxSellingPrice){
            //     maxSellingPrice = profitEachDay[i][1];
            // }
            // else {
            //     profitEachDay[i][1] = maxSellingPrice;
            // }
            // result = Math.max(result, Math.max(profitEachDay[i][0], profitEachDay[i][1]));
        }
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<2; j++){
        //         System.out.print(profitEachDay[i][j] + ",");
        //     }
        //     System.out.println();
        // }
        return Math.max(maxSell, maxBuy);
    }
}