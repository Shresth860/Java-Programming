//import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionOfSortedArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] arr2={1,2,7};
        int n1=arr.length;
        int n2=arr2.length;
//        Set<Integer> nums = new HashSet<>(); // we have use set here because set always store unique element.
//        for(int i=0;i<n1;i++){
//            nums.add(arr[i]);
//        }
//        for(int i=0;i<n2;i++){
//            nums.add(arr2[i]);
//        }
//        System.out.println(nums);

          int i=0,j=0;
          while(i<n1 && j<n2){
              if(arr[i]<arr2[j]){
                  System.out.print(arr[i]+" ");
                  i++;
              }else if(arr2[j]<arr[i]){
                  System.out.print(arr2[j]+" ");
                  j++;
              }else{  // arr[i]==arr2[j]
                  System.out.print(arr[i]+" ");
                  i++;
                  j++;
              }
          }
          while(i<n1){  // for remaining element
              System.out.print(arr[i]+" ");
              i++;
          }
          while(j<n2){  // for remaining element
              System.out.print(arr2[j]+" ");
              j++;
          }
    }
}
