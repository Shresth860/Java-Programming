public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(SellAndBuy(prices));
    }
    static int SellAndBuy(int[] prices){
        int profit=0;
        int minPrice=prices[0];
        int maxProfit=0;
        int Profit=0;
        for(int i=1;i<prices.length;i++){
            minPrice=Math.min(prices[i],minPrice);
            Profit = prices[i]-minPrice;
            maxProfit=Math.max(maxProfit,Profit);
        }
        return maxProfit;
    }
}
