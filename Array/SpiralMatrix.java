import java.util.*;

public class SpiralMatrix
{
    public static void main(String[] args) {
        int[][] matrix ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(matrixRotate(matrix));
    }
    static List<Integer> matrixRotate(int[][] matrix){
        List<Integer> ans = new ArrayList<>();
        int top=0;
        int bottom = matrix.length-1;
        int left=0;
        int right = matrix[0].length-1;
        while(top<=bottom && left<=right){

            // left -> right
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;

            //top-> bottom
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right --;

            // right -> left
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                  ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            // bottom -> top
            if(left<=right){
                for (int i=bottom;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}
