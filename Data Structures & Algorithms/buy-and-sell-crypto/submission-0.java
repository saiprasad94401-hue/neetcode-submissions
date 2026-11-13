class Solution {
    public int maxProfit(int[] prices) {
        int r=0;
        for(int i=0;i<prices.length;i++){
            int buy=prices[i];
            for(int j=i+1;j<prices.length;j++){
                int s=prices[j];
                r=Math.max(r,s-buy);
            }
        }
        return r;
        
    }
}
