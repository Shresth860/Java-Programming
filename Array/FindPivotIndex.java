public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int total = 0;
        for (int num : nums) {
            total += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == total - leftSum - nums[i]) {
                System.out.println("Pivot index is: " + i);
                return;
            }
            leftSum += nums[i];
        }

        System.out.println("No pivot index found");
    }
}
