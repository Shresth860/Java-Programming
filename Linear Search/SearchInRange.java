public class SearchInRange{
    public static void main(String[] args){
        int[] arr={18,12,-7,3,14,28};
        int target =100;
        boolean ans = LinearSearch(arr,target);
        System.out.print(ans);
    }
    static boolean LinearSearch(int[] arr , int target){
        for(int i=1;i<=4;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
}