import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        int n = nums.length;
        int left=0,right=n-1;
            if(nums[left]<nums[right]){
                int temp=nums[right];
                nums[right]=nums[left+1];
                nums[left+1]=temp;
            }else{
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
            }

        System.out.println(nums);
    }
}
