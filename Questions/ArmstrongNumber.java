import java.util.Scanner;
public class ArmstrongNumber{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a three digitnumber:");
       int n = sc.nextInt();
       boolean ans=ArmstrongNumber(n);
       System.out.println(ans);
    }
    static boolean ArmstrongNumber(int n){
        int rem=0;
        int originalAnswer=n;
        int sum=0;
        while(n>0){
          rem=n%10;
          sum += (int)Math.pow(rem,3);
          n=n/10;
        }
        if(originalAnswer==sum){
            return true;
        }else{
            return false;
        }
    }
}