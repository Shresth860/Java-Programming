import java.util.*;
public class BSIn2DSortedArray{
    public static void main(String[] args){
        int[][] arr={
            {2,3,4},
            {6,7,8},
            {10,12,14}
        };
        int target=4;
        System.out.println(Arrays.toString(FindTarget(arr,target)));
    }
    public static int[] FindTarget(int[][] arr , int target){
        int st=0,end=arr.length-1;
        while(st<arr.length && end>=0){
            int mid=st+(end-st)/2;
            if(arr[st][end]==target){
                return new int[]{st,end};
            }else if(arr[st][end]>target){
                end--;
            }else{
                st++;
            }
        }
        return new int[]{-1,-1};
    }
}