public class RotateImageBy90 {
    public static void main(String[] args) {
        int[][] matrix ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        rotate(matrix);
    }
    static void rotate(int[][] matrix){

        // Brute-Force Approach


        int n = matrix.length;
//        // create   ans matrix to store ans
//        int[][] ans = new int[n][n];
//        for(int i=0;i<n;i++){
//            for(int j =0;j<n;j++){
//               ans[j][(n-1)-i] = matrix[i][j];
//            }
//        }
//       for(int[]row : ans){
//           for(int val : row){
//               System.out.print(val+",");
//           }
//       }


        // Optimised Approach

        // transpose the matrix
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        // reverse the matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp = matrix[i][j];
                matrix[i][j]= matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
            }
        }
        for (int[] row : matrix){
            for(int col : row){
                System.out.print(col+",");
            }
        }
    }
}
