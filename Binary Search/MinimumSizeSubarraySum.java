// leetcode 209
import java.util.*;
public class MinimumSizeSubarraySum{
   public static void main(String[] args){
       int[] arr={2,3,1,2,4,3};
       int target=7;
       System.out.println(FindMinLength(arr,target));
   }
   public static int FindMinLength(int[] arr,int target){
      int st=0,sum=0,minLen=Integer.MAX_VALUE;
       for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            while(sum>=target){
                minLen=Math.min(minLen,i-st+1);
                sum-=arr[st++];
            }
        }
        return minLen==Integer.MAX_VALUE?0:minLen;
   }
}
// Sliding Window Technique
// Time Complexity: O(n)