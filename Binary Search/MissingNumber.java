public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(MissNum(arr));
    }
    public static int MissNum(int[] arr){
        int sum=0,Allsum=0;
        int n = arr.length;
        // calculate the Expected sum of array
        for(int i=0;i<=n;i++){
            sum+=i;
        } 
        // Actual sum 
        Allsum = n*(n+1)/2; 

        return   sum-Allsum;
    }
}
// time - complexcity =O(n).
