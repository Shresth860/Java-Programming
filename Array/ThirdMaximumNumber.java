import java.util.Collections;
import java.util.HashSet;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        System.out.println(thirdMaxi(nums));
    }
    static int thirdMaxi(int[] nums){
        int n = nums.length;
        // using hashset for removing duplicate number
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }
        if(set.size()<3){
            //if size is less than 3 than 3rd maximum will be 2nd element
            return Collections.max(set);
        }
        // if size is greater than 3 than remove 1st maxi and 2nd maxi
        set.remove(Collections.max(set));
        set.remove(Collections.max(set));
        return Collections.max(set);
    }
}
