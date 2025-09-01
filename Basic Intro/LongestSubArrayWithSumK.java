public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        int[] arr={10,5,2,7,1,9};
        int n =arr.length;
        int k =15;
        long sum=arr[0];
        int maxi=0;
        int left =0,right=0;
        while(right<n){
            while(left<=right && sum>k){  // ye basically left se aage karne ke liye hai jab sum extra ho jaye
                sum-=arr[left];
                left++;
            }
            if(sum==k){
                maxi=Math.max(maxi,right-left+1);
            }
            right++;
            if(right<n){
                sum+=arr[right];
            }
        }
        System.out.println(maxi);
    }
}
