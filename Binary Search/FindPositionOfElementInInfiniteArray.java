// GreeksForGreeks Question
import java.util.*;
public class FindPositionOfElementInInfiniteArray{
    public static void main(String[] nums){
        int[] arr={3, 5, 7, 9, 10, 90,100, 130, 140, 160, 170};
        int target=10;
        int ans=FindPos(arr,target);
        System.out.println(ans);
    }
    public static int FindPos(int[] arr , int target){
        int st=0,end=1;
        while(end<arr.length && target>arr[end]){
            int temp=end+1;   // temporary store the value of end for future use.
            // change the end
            end=end+(end-st+1)*2;
            if(end>=arr.length){
            end=arr.length-1;
            }
            // now assign end'
            st = temp;

        }
        return binarySearch(arr,target,st,end);
    }
    public static int binarySearch(int[] arr , int target , int st , int end){
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]<target){
                st=mid+1;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}