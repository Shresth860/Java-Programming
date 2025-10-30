import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Closest3Sum {
    public static void main(String[] args) {
        int[] nums ={-1,2,1,-4};
        System.out.println(SumThree(nums));
    }
    static int SumThree(int[] nums){
            int target =1;
            Arrays.sort(nums);
            int n =nums.length;
        int ans = nums[0] + nums[1] + nums[2];
            for(int i=0;i<n-2;i++){

                int j=i+1;
                int k =n-1;

                while(j<k){
                    int sum = nums[i]+nums[j]+nums[k];
                    if (Math.abs(target - sum) < Math.abs(target - ans)) {
                        ans = sum;
                    }
                    if(sum==target){
                        ans=sum;
                    }else if(sum>target){
                        k--;
                    }else{
                        j++;
                    }
                }
            }

            return ans;

    }
}
