import java.util.Arrays;

public class SquareSortedArray {
    public static void main(String[] args) {
        int[] nums ={-4,-1,0,3,10};
        System.out.println(Arrays.toString(SSArray(nums)));
    }
    static int[] SSArray(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        int left=0;
        int i=n-1;
        int right=nums.length-1;
        while(left<=right){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                ans[i--]=nums[left]*nums[left];
                left++;
            }else{
                ans[i--]=nums[right]*nums[right];
                right--;
            }
        }
        return ans;
    }
}
