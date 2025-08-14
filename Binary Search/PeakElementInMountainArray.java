// leetcode 852
import java.util.*;
public class PeakElementInMountainArray{
    public static void main(String[] nums){
        int[] arr ={0,1,0};
        int ans = PeakElement(arr);
        System.out.println(ans);
        
    }
    public static int PeakElement(int[] arr){
        int st=0,end=arr.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]<arr[mid+1]){
                st=mid+1;
            }else{
                end=mid;
            }
        }
        return st; // here we also return e
    }
}
// time-complexcity =O(log(n)).