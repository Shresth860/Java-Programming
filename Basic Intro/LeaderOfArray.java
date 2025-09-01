import java.util.ArrayList;

public class LeaderOfArray {
    public static void main(String[] args) {
        int[] nums={-3, 4, 5, 1, -4, -5};
        int n =nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[n-1]);
        for(int i = n-2;i>=0;i--){
            if(nums[i]>nums[i+1]){
                list.add(nums[i]);
            }
        }
        System.out.println(list);
    }
}
