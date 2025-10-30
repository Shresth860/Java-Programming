import java.util.ArrayList;
import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        int n =3;
        shuffleArray(arr, n);
    }
    static void shuffleArray(int[] arr , int n){
        int[] ans = new int[arr.length];
        int j =0;
        for(int i=0;i<n;i++){
            ans[j++]=arr[i];
            ans[j++]=arr[i+n];
        }
        System.out.println(Arrays.toString(ans));
    }
}
