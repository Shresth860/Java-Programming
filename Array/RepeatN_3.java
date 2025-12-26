import java.util.ArrayList;
import java.util.Arrays;

public class RepeatN_3 {
    public static void main(String[] args) {
        ArrayList<Integer>A=new ArrayList<>(Arrays.asList(1, 2, 3, 1, 1));
        System.out.println(Repeat(A));
    }
    static int Repeat(ArrayList<Integer>A){
        int[]hash=new int[A.size()+1];
        for(int num:A){
            hash[num]++;
        }
        for(int i=1;i<=A.size();i++){
            if(hash[i]>A.size()/3){
                return i;
            }
        }
        return -1;
    }
}
