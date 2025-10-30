import java.util.Arrays;
import java.util.HashSet;

public class FindMissingAndRepeatValue {
    public static void main(String[] args) {
        int[][] grid ={
                {1,3},
                {2,2}
        };
        System.out.println(Arrays.toString(MissingValueAndRepeatValue(grid)));

    }
    //Using Optimised Approach
//    static int[] MissingValueAndRepeatValue(int[][] grid){
//       int n =grid.length;
//       int count=n*n;
//       int[] total = new int[count+1];
//       for(int i=0;i<n;i++){
//           for(int j=0;j<n;j++){
//               total[grid[i][j]]++;  // it will store the frequency of element.
//           }
//       }
//       int[] ans = new int[2];
//       for(int i=1;i<total.length;i++){
//           if(total[i]==2) {  // to store the maximum element
//               ans[0] = i;
//           }
//           if(total[i]==0){  // to store the missing element
//               ans[1]=i;
//           }
//       }
//       return ans;
//    }

    // Using BruteForce Approach
    static int[] MissingValueAndRepeatValue(int[][] grid){
        int n = grid.length; // it will only calculate the row length
        int count = n*n; // it will calculate actual length
        int repeated =-1;
        int actualSum=0;
        HashSet<Integer> total = new HashSet<>();
        for(int[] row : grid){ // row
            for(int num : row){ // column
                if(total.contains(num)) {
                   repeated=num;
                }
                total.add(num);
                actualSum+=num;
            }
        }
        long expectedSum = (long) count*(count+1)/2;
        int MissingValue = (int)expectedSum-(actualSum-repeated);
        return new int[] {repeated,MissingValue};
    }
}
