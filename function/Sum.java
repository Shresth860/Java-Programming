// function using parameter 
import java.util.Scanner;
public class Sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // enter first number
        System.out.println("Enter first number");
        int a = sc.nextInt();
        // enter second number
        System.out.println("Enter second number");
        int b = sc. nextInt();

        int result = Sum(a,b);
        System.out.print("Sum of "+a+" and "+b+" is ->"+result);
    }
    public static int Sum(int a , int b){
          int ans = a+b;
          return ans; 
    }
}