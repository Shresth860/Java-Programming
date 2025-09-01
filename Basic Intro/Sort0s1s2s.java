import java.util.Arrays;

public class Sort0s1s2s {
    public static void main(String[] args) {
        int[] arr={0,1,0,2,0,2};
        int n = arr.length;
      int Zeroes=0,Ones=0,twos=0;
        // iterate for loop
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                Zeroes++;
            }else if(arr[i]==1){
                Ones++;
            }else{
                twos++;
            }
        }
        int index=0;
        while(Zeroes>0){
            arr[index++]=0;
            Zeroes--;
        }
        while(Ones>0){
            arr[index++]=1;
            Ones--;
        }
        while(twos>0){

            arr[index++]=2;
            twos--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
