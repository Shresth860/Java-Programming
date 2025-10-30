public class CountNegativeNumberInSortedMatrix {
    public static void main(String[] args) {
        int[][] grid = {
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-2,-3,-4}
        };
        int cnt=0;
        int n =grid.length;
        int m =grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]<0){
                    cnt++;
                }
            }
        }
        System.out.println(n);
        System.out.println(cnt);
    }
}
