// it is defined as array of arrays

//syntax
//datatype[][] variable_name = new datatype[row][column].
// int[][] arr = new int[3][3];
// imp question
// System.out.println(arr.length); // it shows no of rows 

// input of array
import java.util.Scanner;

public class MultiDimensional{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];  // declare a 2-D array
        System.out.println("Enter elements in 2-D array");
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=sc.nextInt();
            }
        }
        System.out.println("the Element in array are ->");
        //BASIC METHOD TO PRINT 2-D ARRAY
        // for(int row=0;row<arr.length;row++){
        //     for(int col=0;col<arr[row].length;col++){
        //         System.out.print(arr[row][col]+" ");
        //     }
        //     System.out.println();
        // }

        // ADVANCE METHOD TO PRINT 2-D ARRAY    
        for(int row=0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
