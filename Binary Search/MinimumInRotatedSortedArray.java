import java.util.*;
public class MinimumInRotatedSortedArray{
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int st=0,end=nums.length-1;
        while(st<end){
            int mid=st+(end-st)/2;
            if(nums[mid]>nums[end]){
                st=mid+1;
            }else if(nums[mid]<nums[end]){
                end=mid;
            }else{
                end--;
            }
        }
        return nums[st];
    }
}