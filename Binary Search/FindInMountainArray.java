import java.util.*;
public class FindInMountainArray{
    public static void main(String[] nums){
        int[] arr ={1,2,4,5,3,1};
        int target=3;
        int ans = ElementInMountain(arr,target);
        System.out.println(ans);
    }
    public static int ElementInMountain(int[] arr , int target){
        int peak = PeakElementInMountainArray(arr);
        int FirstTry=OrderOfAgnostics(arr,target,0,peak);
        if(FirstTry!=-1){
            return FirstTry;
        }else{
            return OrderOfAgnostics(arr,target,peak+1,arr.length-1);
        }
    }
    public static int PeakElementInMountainArray(int[] arr ){
         int st=0,end=arr.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]<arr[mid+1]){
                st=mid+1;
            }else{
                end=mid;
            }
        }
        return st; 
    }
     static int OrderOfAgnostics(int[] arr , int target , int st,int end){
        boolean isAsc = arr[st]<arr[end];
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(arr[mid]>target){
                    end=mid-1;
                }else{
                    st=mid+1;
                }
            }else{
                if(arr[mid]>target){
                    st=mid+1;
                }else{
                    end=mid-1;
                }
            }

        }
        return -1;
    }
}