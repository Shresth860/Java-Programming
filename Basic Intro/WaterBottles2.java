public class WaterBottles2 {
    public static void main(String[] args) {
        int numBottles=13;
        int numExchange=6;
        int EmptyBottle=0;
        int ans=0;
        while(numBottles>0){
            EmptyBottle+=numBottles;
            ans+=numBottles;
            // main logic of question
            if(EmptyBottle>=numExchange){
                numBottles=1;
                EmptyBottle-=numExchange;
                numExchange++;
            }else{
                numBottles=0;
            }
        }
        System.out.println(ans);
    }
}
