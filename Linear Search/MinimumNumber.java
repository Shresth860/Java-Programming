public class MinimumNumber{
    public static void main(String[] args){
        int[] arr={100,12,45,78,85,21,2};
        int ans = MinimumNumber(arr);
        System.out.println(ans);
    }
    static int MinimumNumber(int[] arr){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}