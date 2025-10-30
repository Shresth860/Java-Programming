import java.util.HashMap;

public class LongestSubarrayWithSumZero {
    public static void main(String[] args) {
        int[] arr ={15, -2, 2, -8, 1, 7, 10, 23};
        int n = arr.length;
        System.out.println(LongestSubArray(arr,n));
    }
    static int LongestSubArray(int[] arr , int n ){

        // BruteForce Approach Using Nested For Loop
//        int cnt=0;
//        int maxCnt=0;
//        for(int i=0;i<n;i++){
//            int sum=0;
//            for(int j=i;j<n;j++){
//                 sum+=arr[j];
//                 if(sum==0){
//                     cnt=j-i+1;
//                     if(cnt>maxCnt){
//                         maxCnt=cnt;
//                     }
//                 }
//            }
//        }
//        return maxCnt;

        // Optimised Approach using HashMap and Prefix sum
        HashMap<Integer,Integer> ans = new HashMap<>();
        int maxLen=0,sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0){
                maxLen= i+1;
            }else if(ans.containsKey(sum)){
                maxLen=Math.max(maxLen,i-ans.get(sum));
            }else{
                ans.put(sum,i);
            }
        }
        return maxLen;
    }
}
