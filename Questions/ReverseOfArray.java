import java.util.Arrays;
public class ReverseOfArray{
    public static void main(String[] args){
        int[] arr={1,12,45,10,100};
        Reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Reverse(int[] arr){
        int st=0,end=arr.length-1;
        while(st<end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
    }
}