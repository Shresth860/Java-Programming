import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums ={5, 5, 5, 5, 5};
        System.out.println(LongestSequence(nums));
    }
    static int LongestSequence(int[] nums){
        Arrays.sort(nums);
        Set<Integer> s = new HashSet<>();
//        int streak=0;
        int ans=0;
        for(int i=0;i< nums.length;i++){
                s.add(nums[i]);
        }
        for(int num : s){
            if(!s.contains(num-1)) {
                int currentNum = num;
                 int streak = 1;

                while (s.contains(num + 1)) {
                    currentNum++;
                    streak++;
                }
                ans = Math.max(ans,streak);
            }
        }
        return ans;
    }
}
