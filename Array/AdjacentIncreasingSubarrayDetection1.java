import java.util.List;

public class AdjacentIncreasingSubarrayDetection1 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,4,4,4,5,6,7);
//        int k =5;
        System.out.println(AdjacentSubarray( nums ));
    }
    static Boolean AdjacentSubarray(List<Integer>nums ){
        int n =nums.size();
        int k=1;
        int ans=0;
        // apply for loop till n
        for(int i=0;i+2*k<n;i++){
            if(IsStricklyIncreasing(nums  , i , i+k-1 ) && IsStricklyIncreasing(nums  , i+k , i+2*k-1 )) {
                return true;
            }
        }
        return false;
    }
    static Boolean IsStricklyIncreasing(List<Integer>nums , int start , int end){
        //apply for loop till end
        for(int i=start ; i<end;i++){
            if(nums.get(i)>=nums.get(i+1)){
                return false;
            }
        }
        return true;
    }
}
