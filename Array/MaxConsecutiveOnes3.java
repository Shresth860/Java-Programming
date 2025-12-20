public class MaxConsecutiveOnes3 {
    public static void main(String[] args) {
        int[] arr ={1,1,1,0,0,0,1,1,1,1,0};
        int k =2;
        int n = arr.length;
        System.out.println(consecutiveOnes(arr,n ,k));
    }
    static int consecutiveOnes(int[] arr , int n , int k){
        int left =0,right=0,maxLen=0,cnt=0;
        while(right<n){
            if(arr[right]!=0){
                maxLen=right-left+1;
                right++;
            }else{
                cnt++;
                right++;
                if(cnt>k){
                    left=right;
                    maxLen=right-left+1;
                }
            }
        }
        return maxLen;

    }
}
