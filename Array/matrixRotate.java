import java.util.ArrayList;
import java.util.List;

public class matrixRotate {
    public static void main(String[] args) {
        int[][] matrix ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Rotate(matrix));

    }
    static List<Integer> Rotate(int[][] matrix){
        List<Integer> ans = new ArrayList<>();
        int top=0;
        int bottom = matrix.length-1;
        int left=0;
        int right = matrix[0].length-1;
        while(top<=bottom && left<=right){
            // bottom -> top
            if(left<=right){
                for (int i=bottom;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }

//            // left -> right
//            for(int i=left;i<=right;i++){
//                ans.add(matrix[top][i]);
//            }
//            top++;
//
//            //top-> bottom
//            for(int i=top;i<=bottom;i++){
//                ans.add(matrix[i][right]);
//            }
//            right --;
//
//            // right -> left
//            if(top<=bottom){
//                for(int i=right;i>=left;i--){
//                    ans.add(matrix[bottom][i]);
//                }
//                bottom--;
//            }

        }
        return ans;
    }
}
