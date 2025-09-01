import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int numRows=5;
        System.out.println(pascalTriangle(numRows));
    }
    static List<List<Integer>> pascalTriangle(int numRows){
        // create a ArrayList to store answer
        ArrayList<List<Integer>> Triangle = new ArrayList<>();
        ArrayList<List<Integer>> ans = new ArrayList<>();
        // apply for loop till numRows
        for(int i=0;i<=numRows;i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i) row.add(1);
                else{
                    row.add(Triangle.get(i-1).get(j-1)+Triangle.get(i-1).get(j));
                }
            }
            Triangle.add(row);
        }
        ans.add(Triangle.get(numRows));
        return ans;
    }
}
