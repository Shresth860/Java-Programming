import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Sum3 {
    public static void main(String[] args) {
        int[] nums ={-1,0,1,2,-1,-4};
        System.out.println(SumThree(nums));
    }
    static List<List<Integer>> SumThree(int[] nums){
        Arrays.sort(nums);
        int n =nums.length;
//        HashSet<List<Integer>> l = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;// skip duplicate
            int j=i+1;
            int k =n-1;

            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0){
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]) continue;
                    while (j<k && nums[k]==nums[k+1]) continue;
                }else if(sum>0){
                    k--;
                }else{
                    j++;
                }
            }
        }

        return ans;

    }
}
