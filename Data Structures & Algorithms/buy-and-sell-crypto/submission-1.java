class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                System.out.println(prices[j]);
                if(prices[i]<prices[j]){
                    int price=prices[j]-prices[i];
                    if(price>profit){
                        profit=price;
                    }
                }
            }
        }
        return profit;
    }
}
