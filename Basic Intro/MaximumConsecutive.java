public class MaximumConsecutive {
    public static void main(String[] args) {
        int[] arr ={1,1,0,1,1,1};
        int n=arr.length;
        int count=0;
        int ans =0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count+=1;
                if(ans<count){
                    ans=count;
                }
            }else{
                count=0;
            }
        }

        System.out.println(ans);
    }
}
