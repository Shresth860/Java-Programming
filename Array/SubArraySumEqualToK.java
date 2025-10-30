public class SubArraySumEqualToK {
    public static void main(String[] args) {
        int[] nums={1,2,1,2,1};
        int k =3;
        System.out.println(Sum(nums , k));
    }
    static int Sum(int[] nums , int k){
        int n =nums.length;
        int cnt=0;
       for(int i=0;i<n;i++){
           int sum=0;
           for(int j=i;j<n;j++){
               sum+=nums[j];
               if(sum==k){
                   cnt++;
               }
           }
       }
        return cnt;
    }
}
