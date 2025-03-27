package striver.Arrays.medium;

public class StockBuySell {
    public static void main(String[] args){
        int[] prices= {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
        System.out.println(maxProfit2(prices));
    }
    //Brute force: TC:O(n^2), SC: O(1)
    public static int maxProfit(int[] prices){
        int maxProfit=0;
        for(int i=0; i<prices.length; i++)
            for(int j=i+1; j< prices.length;j++)
                if(prices[j] > prices[i])
                    maxProfit=Math.max(prices[j]- prices[i], maxProfit);
        return maxProfit;
    }
    //Optimal approach: TC:O(n), SC: O(1)
    public static int maxProfit2(int[] prices){
        int maxProfit=0, minPrice= prices[0];
        for(int i=1; i<prices.length; i++){
            int profit= prices[i]- minPrice;
            maxProfit= Math.max(maxProfit, profit);
            minPrice= Math.min(minPrice, prices[i]);
        }
        return maxProfit;
    }
}
