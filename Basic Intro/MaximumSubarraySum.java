public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] nums={-2,-3,4,-1,-2,1,5,-3};
        int n=nums.length;

        int maxSum=0;
        // Better approach
//        for(int i=0;i<n;i++){
//            int sum=0;
//            for(int j=i;j<n;j++){
//                sum+=nums[j];
//                if(sum>maxSum){
//                    maxSum=sum;
//                }
//            }
//        }
        // Optimised approach(Kandane's Algo)
        int sum=0;
        int start=0;
        int ansStart=-1,ansEnd=-1;
        for(int i=0;i<n;i++){
             if(sum==0) {
                 start=i;
             }
            sum+=nums[i];
            if(sum>maxSum){
                maxSum=sum;
                 ansStart=start;
                 ansEnd =i;
            }

            if(sum<0){
                sum=0;
            }
        }
        System.out.println(maxSum);


        // follow-UP Question Approach
//        for(int i=ansStart;i<=ansEnd;i++){
//            System.out.print(nums[i]+" ");
//        }
    }
}
