import java.util.Scanner;
public class Swap2Number{
    public static void main(String[] args){
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number ->");
        a = sc.nextInt();
        System.out.println("Enter 2nd number ->");
        b = sc.nextInt();
        System.out.println("Before swapping");
        System.out.println("a-> "+a+" and b -> "+b);
         System.out.println("After swapping");
        swap(a,b);
        System.out.println("a-> "+a+" and b -> "+b);
    }
    public static int swap(int a, int b){
       int temp=a;
       a=b;
       b=temp;
       return {a,b};
    }
}