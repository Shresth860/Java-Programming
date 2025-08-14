import java.util.*;
public class PeakElementInRSAWithDuplicate{
    public static void main(String[] nums){
        int[] arr ={2,2,2,2,9,2,2};
        System.out.println(PeakElement(arr));
    }
    public static int PeakElement(int[] arr){
        int st=0,end=arr.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            // case 1
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }

            //case 2
            if(mid>st && arr[mid]<arr[mid-1]) return mid-1;
            
            // case 3
            if(arr[st]==arr[mid] && arr[mid]==arr[end]){
                if(st<end && arr[st]>arr[st+1]){
                    return st;
                }
                st++;
                if(end>st && arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;

            }
            // case 4
            // left side is sorted and pivot will be in right side
            else if(arr[st]<arr[mid] || arr[st]==arr[mid] && arr[mid]>arr[end]){
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}