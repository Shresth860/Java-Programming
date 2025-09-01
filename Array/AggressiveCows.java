import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int[] stalls = {1, 2, 4, 8, 9}; // arrays
        int cows = 3; // no.of cows
        System.out.println(AggressCows(stalls,cows));
    }
    public static int AggressCows(int[] stalls , int cows){
        Arrays.sort(stalls);
        int ans =0;
        int st=stalls[0],end=stalls[stalls.length-1]-stalls[0];
        while(st<=end){
            int mid = st+(end-st)/2;
            if(CanPlace(stalls,cows,mid)){  // boolean function
                ans=mid;
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
    private static  boolean CanPlace(int[] stalls , int cows , int mid){
       int cow=1;
       int lastPos=stalls[0];
       for(int i=1;i< stalls.length;i++){
           if(stalls[i]-lastPos>=mid){
               cow++;
               lastPos=stalls[i];
           }
           if(cow==cows) return true;
       }
       return  false;
    }
}
