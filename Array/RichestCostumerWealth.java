import java.util.Arrays;
import java.util.List;

public class RichestCostumerWealth {
    public static void main(String[] args) {
        List<List<Integer>> B = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6)
        );

        System.out.println(MaxConsumerWealth(B));
    }

    private static int MaxConsumerWealth(List<List<Integer>> b) {
        int Rich =0;
        for(List<Integer> i : b){
            int MaxSum=0;
            for(int money : i){
                 MaxSum+=money;
            }
             Rich = Math.max(MaxSum,Rich);
        }
        return Rich;
    }

}
