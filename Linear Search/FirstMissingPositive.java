import java.util.Arrays;
public class FirstMissingPositive{

    public static void main(String[] nums){
        int[] num={1,2,0};
        System.out.println(FirstMissingPositive(num));
    }
    private static void swap(int[] nums , int i , int j){
        int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
    }
    static int FirstMissingPositive(int[] nums){
      Arrays.sort(nums);
      for(int i=0;i<nums.length;i++){
        while(nums[i]>0 && nums[i]<=nums.length && nums[nums[i]-1]!=nums[i]){
            swap(nums,i,nums[i]-1);
        }
      }
       for(int i=0;i<nums.length;i++){
           if(nums[i]!=i+1){
             return i+1;
            }
        }
        return nums.length+1;
    }
}