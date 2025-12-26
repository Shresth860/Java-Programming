import java.util.ArrayList;
import java.util.Arrays;

public class SumMaxAndMin {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(-2, 1, -4, 5, 3));
        System.out.println(SMaxMin(A));
    }
    static int SMaxMin(ArrayList<Integer>A){
        int max=A.get(0);
        int min=A.get(0);
        for(int i=0;i<A.size();i++){
            if(max<A.get(i)){
                max=A.get(i);
            }
            if(min>A.get(i)){
                min=A.get(i);
            }
        }
        int sum=max+min;
        return sum;
    }
}
