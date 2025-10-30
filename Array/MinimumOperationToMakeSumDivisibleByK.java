public class MinimumOperationToMakeSumDivisibleByK {
    public static void main(String[] args) {
        int[] arr ={3,9,7};
        int k =5;
        System.out.println(DivisibleByk(arr,k));
    }
    static int DivisibleByk(int[] arr , int k ){
        int n =arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return sum%k;
    }
}
