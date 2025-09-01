//leetcode : 769
public class MaxChunksToSorted {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(MaxChu(arr));
    }
    public static int MaxChu(int[] arr){
        int n = arr.length;
        int max =Integer.MIN_VALUE,chunks=0;   // Basically chunks means partitions
        for(int i=0;i<n;i++){
            max =Math.max(max,arr[i]);
            if(max==i){
                chunks++;
            }
        }
        return chunks;
    }
}
// Algorithm : Greedy+Prefix Max Tracking
