import java.util.Arrays;

public class RearrangeTheArrayInAlternatePos {
    public static void main(String[] args) {
        int[] nums ={3,1,-2,-5,2,-4};
        int n = nums.length;
        //Brute force Approach T.C=(O(2N)) .
//        int[] pos = new int[n/2];
//        int[] neg = new int[n/2];
//        int p=0,q=0;
//        for(int i=0;i<n;i++){
//            if(nums[i]<0){
//                neg[p++]=nums[i];
//            }else{
//                pos[q++]=nums[i];
//            }
//        }
//        for(int i=0;i<n/2;i++){
//            nums[2*i]=pos[i];
//            nums[2*i+1]=neg[i];
//        }
//        System.out.println(Arrays.toString(nums));


        // optimised approach
        int[] res = new int[n];
        int neg=1,pos=0;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
              res[neg]=nums[i];
              neg+=2;
            }else{
                res[pos]=nums[i];
                pos+=2;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
