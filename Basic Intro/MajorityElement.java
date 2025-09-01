import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums={3,2,3};
        int n =nums.length;
         // better approach
        HashMap<Integer,Integer> mpp = new HashMap<>();
        // precompute
        for(int i=0;i<n;i++){
            mpp.put(nums[i], mpp.getOrDefault(nums[i],0)+1);
        }
        // fetch
        for(Map.Entry<Integer,Integer> entry : mpp.entrySet()){
            if(entry.getValue()>n/2){
                System.out.println(entry.getKey());
            }
        }
    }
}
