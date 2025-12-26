import java.util.ArrayList;
import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {
        ArrayList<Integer>A = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer>B= new ArrayList<>(Arrays.asList(2,5,5));
        System.out.println(Sum(A,B));
    }
    static ArrayList<Integer> Sum(ArrayList<Integer>A , ArrayList<Integer>B){
        // resultant array
        ArrayList<Integer>ans=new ArrayList<>();

        int len1=A.size();
        int len2= B.size();
        int i=len1-1;
        int j=len2-1;
        int carry=0;

        while(i>=0 || j>=0 || carry>0){
            int sum=carry;
           if(i>=0){
               sum+=A.get(i);
               i--;
           }
           if(j>=0){
               sum+=B.get(j);
               j--;
           }
           ans.add(0,sum%10);
           carry=sum/10;
        }
        return ans;
    }
}
