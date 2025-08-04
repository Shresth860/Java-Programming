public class MaxWealth{
    public static void main(String[] args){
        int[][] nums={{1,5},{3,7},{1,2}};
        System.out.println(MaxWealth(nums));
    }
    static int MaxWealth(int[][] nums){
       int Maxwealth=0;
        for(int rows=0; rows < nums.length ;rows++){
           int ans=0;
           for(int col=0;col<nums[rows].length;col++){
             ans+=nums[rows][col];
            }
            if(ans>Maxwealth){
                Maxwealth=ans;
            }
        }
        return Maxwealth;
    }
}