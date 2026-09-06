class Solution {
    public int maxProfit(int[] prices) {
        int minsellval=Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<minsellval){
                minsellval=prices[i];
            }
            int profit =prices[i]-minsellval;
            if(maxprofit < profit){
                maxprofit=profit;
            }
        }
        return maxprofit;
    }
}
