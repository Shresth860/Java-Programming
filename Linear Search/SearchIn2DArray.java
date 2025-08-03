public class SearchIn2DArray{
    public static void main(String[] args){
        int[][] arr ={
            {12,21,11,14},
            {45,4,1},
            {16},
        };
        int target=4;
        int[] ans = SearchIn2DArray(arr,target);
        if(ans[0]!=-1){
            System.out.println("element found at row "+ans[0]+" and col "+ans[1]);
        }else{
            System.out.println("element not found");
        }
    }
    static int[] SearchIn2DArray(int[][] arr, int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}