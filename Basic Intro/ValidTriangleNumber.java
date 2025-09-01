import java.util.Arrays;

public class ValidTriangleNumber {
    public static void main(String[] args) {
        int[] nums = {4,2,3,4};
        int n =nums.length;
        int cnt=0;
        Arrays.sort(nums);

        // brute force approach
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//               for(int k=j+1;k<n;k++){
//                   int a =nums[i] , b=nums[j], c=nums[k];
//                   if(a+b>c && a+c>b && c+b>a){
//                       cnt++;
//                   }
//               }
//            }
//        }

        // Optimised approach (2- pointer Technique)
      for(int k=n-1;k>=2;k--){   // int[] nums = {2,3,4,4};
          int i=0,j=k-1;
          while(i<j){
              if(nums[i]+nums[j]>nums[k]){
                  cnt+=(j-i);
                  j--;
              }else{
                  i++;
              }
          }
      }
        System.out.println(cnt);
    }
}
