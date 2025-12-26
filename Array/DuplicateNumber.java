import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(3, 4, 1, 4, 2));
        System.out.println(Duplicate(A));
    }
    static int Duplicate(ArrayList<Integer>A){
        int duplicate=-1;
        int n =A.size();
        int[] hash = new int[n + 1];
        for(int i : A){
            hash[i]++;
            if(hash[i]==2){
               duplicate=i;
            }
        }
        return duplicate;
    }
}
