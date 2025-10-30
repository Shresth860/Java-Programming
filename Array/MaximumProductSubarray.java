public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] arr ={2,3,-2,4};
        int n =arr.length;
        System.out.println(MaxSubArray(arr,n));
    }
    static int MaxSubArray(int[] arr , int n){
        int preSum=1,SuffixSum=1;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(preSum==0) {
                preSum=1;
            }
            if(SuffixSum==0){
                SuffixSum=1;
            }
            preSum*=arr[i];
            SuffixSum*=arr[n-i-1];

            ans = Math.max(ans,Math.max(preSum,SuffixSum));
        }
        return ans;
    }
}
