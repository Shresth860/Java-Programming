public class WaterBottles {
    public static void main(String[] args) {
        int numBottles = 9; // total water bottle
        int numExchange=3;  // exchange limit of water bottle
        int EmptyBottle=0,ans=0;
        while(numBottles>0){
            EmptyBottle+=numBottles;
            ans+=numBottles;
            numBottles=EmptyBottle/numExchange;
            EmptyBottle%=numExchange;
        }
        System.out.println(ans);
    }
}
