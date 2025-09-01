public class Hashing {
    public static void main(String[] args) {
        int[] arr ={1,3,2,1,2};
        int n = arr.length;
        int N=1;
        int cnt=0;
//        // brute force approach   // time-complexcity =O(n)
//        for(int i=0;i<n;i++){
//            if(arr[i]==N){
//                cnt+=1;
//            }
//        }


        // better Approach
        // declare Hash Array   // time-complexcity =O(n)
        int[] hash = new int[n];
        //pre compute
        for(int i=0;i<n;i++){
            hash[arr[i]]+=1;   //prestoring
        }

        // fetching the number
        System.out.println(hash[N]);
    }
}
