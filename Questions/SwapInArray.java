import java.util.Arrays;
public class SwapInArray{
    public static void main(String[] args) {
        int[] arr = {1,12,3,45,41};
        swap(arr,1,3); // here we passing the array and both the index in argument.
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int index0,int index3){
        int temp = arr[index0];
        arr[index0] = arr[index3];
        arr[index3] = temp;
    }
}
