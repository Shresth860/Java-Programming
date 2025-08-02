// collection of values of same datatype.

// Syntax
// datatype[] variable_name = new datatype[size];
//                     OR
// datatype[] variable_name={element of array};
// ex:
// int[] a = new int[5];
// OR
// int[] a ={1,2,30};

// int[] rollno; -> declaration of array . rollno is defined in the stack
// rollno = new int[5]; ->Initialization & allocation of memory in the heap

import java.util.Scanner;
public class intro{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input in array   
        // int[] arr= new int[5];
        // System.out.println("enter the element of array :-");
        // for(int i=0;i<5;i++){
        //     arr[i]=sc.nextInt();
        // }

        // // print the array
        // for(int i=0;i<5;i++){
        //     System.out.println(arr[i]);
        // }



        // INPUT IN STRING
        String[] str= new String[5];
        System.out.println("enter the element of array :-");
        for(int i=0;i<5;i++){
            str[i]=sc.next();
        }

        // print the string array
        for(int i=0;i<5;i++){
            System.out.print(str[i]+" ");
        }
    }

}
