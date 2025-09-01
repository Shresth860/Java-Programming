public class jumpGame {
    public static void main(String[] args) {
        int[] nums={1,2,4,1,1,0,2,3};
        int n = nums.length;
        System.out.println(jumpG(nums,n));

    }
    public static Boolean jumpG(int[] nums , int n){
        int maxIndex =0;
        for(int i=0;i<n;i++){
            if(i>maxIndex){
                return false;
            }
            maxIndex=Math.max(maxIndex,i+nums[i]);

        }
        return true;
    }
}
