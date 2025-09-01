//import static java.util.Collections.swap;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr ={0,1,0,3,4};
        int index =0;// for placing non-zero element
        int n = arr.length;
        for(int i=0;i<n;i++){
          if(arr[i]!=0){
              int temp=arr[i];
              arr[i]=arr[index];
              arr[index]=temp;

              index++;
          }
        }
        System.out.println(Arrays.toString(arr));
    }
}
