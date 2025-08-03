import java.util.Arrays;
import java.util.Scanner;

public class MaxValueinArray{
    public static void main(String[] args){
        int[] arr = {10,12,1,35,100};
        
        System.out.println(max(arr));
    }
    static int max(int[] arr){
      int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}