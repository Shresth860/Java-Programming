import java.util.*;
public class ReachANumber {
    public static void main(String[] args) {
        int target=2;
        System.out.println(ReachNumber(target));
    }
    public  static int ReachNumber(int target){
        int t = Math.abs(target);
        int steps =0,sum=0;
        while(steps<t || (sum-t)%2!=0){
            steps++;
            sum+=steps;
        }
        return steps;
    }
}
