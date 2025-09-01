public class MissingNumberAgain {
    public static void main(String[] args) {
        int[] arr={0,1};
        int n =arr.length;
        // declare hash
        int[] hash = new int[n+1];

        for(int i=0;i<n;i++){  // prestoring
            hash[arr[i]]+=1;
        }
        // fetching
        int ans =0;
        for(int i=0;i<hash.length;i++){
            if(hash[i]==0){
                ans=i;
            }
        }

        System.out.println(ans);
    }
}
