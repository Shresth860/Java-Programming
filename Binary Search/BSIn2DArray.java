import java.util.*;
public class BSIn2DArray{
    public static void main(String[] nums){
        int[][] arr ={
            {12,25,30},
            {22,27,32},
            {31,52,71}
        };
        int target=100;
        System.out.println(Arrays.toString(Search(arr,target)));
    }
    public static int[] Search(int[][] arr , int target){
        int st=0;   // st==row
        int end = arr.length-1; // end == column

        while(st<arr.length && end>=0){
            if(arr[st][end]==target) {
                return new int[]{st,end};
            }else if(arr[st][end]<target){
                st++;   // row++
            }else{
                end--;   // column--
            }
        }
        return new int[]{-1,-1};
    }
}
// time-complexcity =O(rows+col).