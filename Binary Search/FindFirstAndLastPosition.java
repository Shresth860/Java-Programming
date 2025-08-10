//leetcode 34
import java.util.*;
public class FindFirstAndLastPosition{
    public static void main(String[] nums){
        int[] arr={5,7,7,8,8,10};
        int target=8;
       int[] ans = FirstAndLast(arr,target);
       System.out.println(Arrays.toString(ans));
    }
    public static int[] FirstAndLast(int[] arr,int target){
        int[] results = new int[2];
        results[0] = findPosition(arr,target,true);
        results[1]=findPosition(arr,target,false);
        return results;
    }
    static int findPosition(int[] arr , int target , boolean FindFirst){
        int st=0,end=arr.length-1;
        int ans=-1;
        while(st<=end){
            int  mid=st+(end-st)/2;
            if(arr[mid]==target){
               ans=mid;
               if(FindFirst){
                end=mid-1;
               }else{
                st=mid+1;
               }
            }
            else if(arr[mid]<target){
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
}