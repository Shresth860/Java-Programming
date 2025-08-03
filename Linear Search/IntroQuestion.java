// linear search is the first searching approach used in question. It basically iterate through hole array in search of target..
import java.util.Arrays;
public class IntroQuestion{
    public static void main(String[] args){
       int[] arr={10,12,54,18,100};
       int target=101;
       int ans = LinearSearch(arr,target);
       System.out.println(ans);
    }
    static int LinearSearch(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
// time-complexcity =O(n).