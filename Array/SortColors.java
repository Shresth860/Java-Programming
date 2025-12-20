import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr ={2,0,2,1,1,0};
        System.out.println(Arrays.toString(SortingColor(arr)));
    }
    static int[] SortingColor(int[] arr){
        int n = arr.length;
        // count all the color first
        // red=Zeroes , white=Ones , blue=Twos
        int Zeroes=0,Ones=0,Twos=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                Zeroes++;
            }else if(arr[i]==1){
                Ones++;
            }else{
                Twos++;
            }
        }
        int index=0;
        while(Zeroes>0){
            arr[index++]=0;
            Zeroes--;
        }
        while (Ones>0){
            arr[index++]=1;
            Ones--;
        }
        while (Twos>0){
            arr[index++]=2;
            Twos--;
        }
        return arr;
    }
}
