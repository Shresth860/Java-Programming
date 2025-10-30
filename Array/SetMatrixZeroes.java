import java.util.Arrays;


public class SetMatrixZeroes
{
    public static void main(String[] args) {
        int[][] matrix ={
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        ZeroMatrix(matrix);
        for(int[] row : matrix){
            System.out.println(Arrays.toString(row));
        }
    }
    static void ZeroMatrix(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        // iterate over matrix
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    MarkRow(i , matrix , col);
                    MarkCol(j , matrix , row);
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==-90){
                    matrix[i][j]=0;

                }
            }
        }

    }

    private static void MarkCol(int j , int[][] matrix , int row) {
        for(int i=0;i<row;i++){
           if(matrix[i][j]!=0){
               matrix[i][j]=-90;
           }
        }
    }

    private static void MarkRow(int i , int [][] matrix , int col) {
        for(int j=0;j<col;j++){
            if(matrix[i][j]!=0){
                matrix[i][j]=-90;
            }
        }
    }
}

