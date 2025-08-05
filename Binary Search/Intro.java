// Basic Intro Question
public class Intro{
    public static void main(String[] args){
        int[] nums={12,25,65,80,114};
        int target=80;
        int ans = BinarySearch(nums,target);
        System.out.println(ans);
    }
    static int BinarySearch(int[] nums , int target){
        int st=0,end=nums.length-1;
        while(st<end){
            int mid=st+(end-st)/2;
            if(nums[mid]==target) {
                return mid;
            }
            else if(nums[mid]<target){
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
// time-complexity = O(log n).