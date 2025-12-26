import java.util.ArrayList;
import java.util.Arrays;

public class RepeatAndMissingElement {
    public static void main(String[] args) {
        ArrayList<Integer> A =new ArrayList<>(Arrays.asList(3,1,2,5,3));
        System.out.println(RAndM(A));
    }
    static ArrayList<Integer> RAndM(ArrayList<Integer>A){
       ArrayList<Integer>ans=new ArrayList<>();
        int[] hash= new int[A.size()+1];
        for(int i : A){
            hash[i]++;

        }
        for(int i=1;i<=A.size();i++){
            if(hash[i]==2){
                ans.add(i);
            }
            if(hash[i]==0){
                ans.add(i);
            }
        }

        return ans;
    }
}
