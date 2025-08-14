import java.util.*;
public class FindPivotInRSA{
    public static void main(String[] nums){
      int[] arr ={4,5,6,7,0,1,2};
      System.out.println(FindPivot(arr));
    }
    public static int FindPivot(int[] arr){
        int st=0,end=arr.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            // write all condition
            // case 1
            if(arr[mid]>arr[mid+1]) return mid;
            // case 2
            if(arr[mid]<arr[mid-1]) return mid-1;
            // case 3
            // start ya end bhi to pivot ho sakta hai
            // start check karo
            if(arr[st]>arr[st+1]) return st;
            if(arr[mid]<=arr[st]){
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        return -1;
    }
}
// pivot matlab wo element jo apne aas pass ke sabhi element se bada hota hai jaise iss question mein 7 hai..