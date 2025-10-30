import java.util.Arrays;

public class Segregate0sand1s {
    public static void main(String[] args) {
        int[] arr ={0,0,1,1,0};
        int n = arr.length;
        System.out.println(Arrays.toString(segregate(arr,n)));
    }
    static int[] segregate(int[] arr , int n){
//        int numberofZeroes=0;
//        int numberofOnes=0;
//        for(int num : arr ){
//            if(num==0){
//                numberofZeroes++;
//            }else{
//                numberofOnes++;
//            }
//        }
//        for(int i=0;i<numberofZeroes;i++){
//            arr[i]=0;
//        }
//        for(int i=numberofZeroes;i<arr.length;i++){
//            arr[i]=1;
//        }
//        return arr;

        int i=0,j=n-1;
       while(i<j){
           if(arr[j]==1){
               j--;
           }
           else if(arr[i]==0){
               i++;
           }
           else{
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               i++;
               j--;
           }
       }
       return arr;
    }
}
