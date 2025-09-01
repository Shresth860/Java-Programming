import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr ={2,2,1}; //{1,2,2}
        Arrays.sort(arr);
        int n=arr.length;
        int count=0;
        int ans =0;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                count+=1;
            }else{
                count=0;
                
            }
        }
        System.out.println(ans);
    }
}
