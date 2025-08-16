import java.util.*;
public class Merge2SortedArray{
    public static void main(String[] args){
        int[] nums1={1,2};
        int[] nums2={3,4};
        int[] result =MergeArray(nums1,nums2);
        System.out.println(Median(result));
    }
    public static int[] MergeArray(int[] nums1,int[] nums2){
        int m=nums1.length;
        int n=nums2.length;
        int[] merged = new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                merged[k++]=nums1[i++];
            }else{
                merged[k++]=nums2[j++];
            }
        }
        // merged remaining element in array
        while(i<m){
          merged[k++]=nums1[i++];
        }

        while(j<n){
            merged[k++]=nums2[j++];
        }
      return merged;
    }
    public static double Median(int[] result){
        int n= result.length;
         int mid=n/2;
        if(result.length%2==0){
           return (result[mid]+result[mid-1])/2.0;
          
        }else{
           return result[mid];
        }

    }
    
}