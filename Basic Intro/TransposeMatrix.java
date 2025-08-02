import java.util.Scanner;

public class TransposeMatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Enter rows
        System.out.println("Enter number of Rows -> ");
        int rows = sc.nextInt();
        // Enter columns
        System.out.println("Enter number of Columns -> ");
        int columns = sc.nextInt();

        int [][] matrix = new int[rows][columns];

        // input matrix
        System.out.println("Enter Matrix Elements -> ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
             
                matrix[i][j] = sc.nextInt();
            }
        }
  
        System.out.println("Matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to next line after each row
        }
          // Calling Transpose function
          TransposeMatrix(matrix);
    }
    public static void TransposeMatrix(int[][] arr) {
        int rows = arr.length;
        int columns = arr[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        System.out.println("Transpose of Matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Move to next line after each row
        }
    }
}