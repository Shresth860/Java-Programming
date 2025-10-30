public class MinimumOperationToConvertAllElementToZero {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 1};
        System.out.println(minOperations(nums)); // Output: 3
    }

    static int minOperations(int[] nums) {
        int ans = 0;
        int prev = 0;
        for (int num : nums) {
            if (num > prev) {
                ans += num - prev;
            }
            prev = num;
        }
        return ans;
    }
}
