import java.util.Scanner;

public class Max{
    public static void main(String[] args) {
        int [] arr={5,-3,7,6,2,1,8,3,0,4};
        int n=arr.length;
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum element is: "+max);
    }
}