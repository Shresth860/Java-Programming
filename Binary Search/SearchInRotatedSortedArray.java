import java.util.*;
public class SearchInRotatedSortedArray{
    public static void main(String[] nums){
        int[] arr ={4,5,6,7,0,1,2};
        int target =0;
        int ans =SearchTarget(arr,target);
        System.out.println(ans);
    }
    public static int SearchTarget(int[] arr , int target){
        int st=0,end=arr.length-1;
        // int ans=0;
        // boolean Isans = arr[st]<arr[end];
        while(st<=end){
            int mid =st+(end-st)/2;
            if(arr[mid]==target) return mid;
            if(arr[st]<=arr[mid]){ // left half sorted
                if(target>=arr[st] && target<arr[mid]){  // left ke left mein
                    end=mid-1;
                }else{  // left ke right mein
                    st=mid+1;
                }
            }else{ // right half sorted
                if(target>arr[mid]&& target <=arr[end]){  // right ke right mein
                    st=mid+1;
                }else{   // right ke left mein
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}