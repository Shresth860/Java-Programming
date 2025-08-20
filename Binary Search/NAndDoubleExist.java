import java.util.*;
public class NAndDoubleExist{
    public static void main(String[] args){
        int[] arr={7,1,14,11};
        System.out.println(DoubleExist(arr));
    }
    public static boolean DoubleExist(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int target = 2*arr[i];
            if(BinarySearch(arr,target,i)){
                return true;
            }
        }
        
        return false;
    }
    public static boolean BinarySearch(int[] arr , int target , int i){
        int st=0,end=arr.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==target && mid!=i){
                return true;
            }else if (arr[mid]<target){
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return false;
    }
}