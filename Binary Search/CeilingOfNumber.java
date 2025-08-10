import java.util.*;

public class CeilingOfNumber{
    public static void main(String[] nums){
        int[] arr={2,4,6,8,12,14,16};
        int target = 15;
        int ans = CeilingOfNumber(arr,target);
        System.out.println(ans);
    }
    static int CeilingOfNumber(int[] arr ,  int target){
        int st=0,end=arr.length-1;
        // int ans=-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid]==target){
                return arr[mid];

            }else if(arr[mid]<target){
                st=mid+1;
                
            }else{
                end=mid-1;
            }
        }
        return arr[st];
    }
}
// time-complexcity =O(log n).