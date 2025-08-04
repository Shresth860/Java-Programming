public class EvenDigits{
    public static void main(String[] args){
        int[] nums={12,2,3,412};
        System.out.println(findNumber(nums));
    }
    static int findNumber(int[] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(Integer.toString(nums[i]).length()%2==0){
                count++;
            }
        }
        return count;
    }
}