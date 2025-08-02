import java.util.Scanner;
public class primeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check :-");
        int num = sc.nextInt();
        boolean ans = primeNumber(num);
        System.out.println(ans);

    }
    static boolean primeNumber(int num){
        if(num<=1){
            return false;
        }
        int c=2;
        while(c*c<=num){
            if(num%c==0){
                return false;
            }
            c++;
        }
        return true;    
    }
}