import java.util.Scanner;

public class PrintName{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the greeting name -> ");
        String name= sc.next();
        Greeting(name);
    }
    public static void Greeting(String name){
        System.out.println("Hello "+name);
    }
}