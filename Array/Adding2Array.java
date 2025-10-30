import java.util.Collections;
import java.util.Vector;

public class Adding2Array {
    public static void main(String[] args) {
        int[] arr ={3,5,2,0,7};
        int[] arr2={9,2,1};
        Vector<Integer> ans = add2Arr(arr,arr2);
        System.out.println(ans);
    }
    static Vector<Integer> add2Arr(int[] arr , int [] arr2){
        int n =arr.length;
        int m = arr2.length;
        Vector<Integer> ans=new Vector<>();
        if(n>m){
            int i=n-1;
            int j=m-1;
            int carry=1;
            for(int k=n-1;k>=0;k--){
                int sum=arr[i]+arr2[j]+carry; // add 1st array+2nd array
                if(sum<=9){
                   ans.add(sum);
                   carry=0;
                }else{
                    ans.add(0);
                    carry=1;
                }

            }
        }else{
            int i=n-1;
            int j=m-1;
            int carry=1;
            for(int k=m-1;k>=0;k--){
                int sum=arr[i]+arr2[j]+carry; // add 1st array+2nd array
                if(sum<=9){
                    ans.add(sum);
                    carry=0;
                }else{
                    ans.add(0);
                    carry=1;
                }

            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
