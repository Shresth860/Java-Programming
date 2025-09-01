import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdjacentIncreasingSubarrayDetection2 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4));
        System.out.println(AdjacentIncreasing(nums));
    }
    static int AdjacentIncreasing(List<Integer> nums ){
        int n = nums.size();
        if (n == 0) return 0;

        int cnt = 1, precnt = 0, ans = 0;

        for (int i = 1; i < n; ++i) {
            if (nums.get(i) > nums.get(i - 1)) {
                ++cnt;
            } else {
                precnt = cnt;
                cnt = 1;
            }
            ans = Math.max(ans, Math.min(precnt, cnt));
            ans = Math.max(ans, cnt / 2);
        }

        return ans;
    }
}
