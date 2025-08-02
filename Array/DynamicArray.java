// dynamic array is basically knows as arraylist .. if somewhere we want to use dynamic array then we only want to use arraylist
// arraylist is similar to vector in c++..
import java.util.Scanner;
import java.util.ArrayList;

public class DynamicArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // declaration  of arraylist
        ArrayList<Integer> arr = new ArrayList<>(10);

        // arr.add(20);
        // arr.add(200);
        // arr.add(15);
        // arr.add(25);
        // arr.add(30);
        // arr.add(45);
        // arr.add(21);
        // arr.add(210);
        // arr.add(22);

        // print the arraylist
        System.out.println(arr);

        //input in arraylist using loop
        for(int i=0;i<5;i++){
            arr.add(sc.nextInt());
        }
        System.out.println(arr);
    }
}