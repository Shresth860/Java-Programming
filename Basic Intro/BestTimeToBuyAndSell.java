public class BestTimeToBuyAndSell {
    public static void main(String[] args) {
        int[] Prices ={7,6,4,3,2,1};
        int BuyTime=Prices[0];
        int SellTime=0;
        int ans=0;
        for(int i=0;i<Prices.length;i++){
            if(Prices[i]<BuyTime){
                BuyTime=i;  // buy day

            }
        }
        for(int i=BuyTime+1 ;i<Prices.length;i++){
            if(Prices[i]>Prices[SellTime]){
                SellTime=i;
            }
        }
       if(SellTime>BuyTime){
           ans=Prices[SellTime]-Prices[BuyTime];
       }
        System.out.println(ans);
    }
}
