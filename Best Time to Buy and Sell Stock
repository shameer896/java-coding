class Solution {
    public int maxProfit(int[] prices) {
     int min=9999;
     int profit=0;
     int temp=0;
     for(int i=0;i<prices.length;i++)
     {
         if(prices[i]<min){
            min=prices[i];
            }
        profit=prices[i]-min;
        if(profit>temp)
        temp=profit;
     }
     return temp;
    }

}
