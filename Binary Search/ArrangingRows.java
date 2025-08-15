// leetcode 441.
import java.util.*;
public class ArrangingRows{
    public static void main(String[] nums){
        int n =5;
        System.out.println(Coins(n));
    }
    public static int Coins(int n){
        int st=1,end=n;
        while(st<=end){
            int mid=st+(end-st)/2;
            long CoinsAtMid=(long) mid*(mid+1)/2;
            if(CoinsAtMid>n){
                end=mid-1;
            }else if (CoinsAtMid<n){
                st=mid+1;
            }else{
                return mid;
            }
        }
        return end;
    }
}