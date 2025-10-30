import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] arr ={1,0,-1,0,-2,2};
        int target = 0;
        System.out.println(FSum(arr,target));
    }
    static List<List<Integer>> FSum(int[] arr , int target){
        int n = arr.length;
        // create a new ArrayList to store ans
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<n-3;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            for(int k =i+1;k<n-2;k++){
                if(k>i+1 && arr[k]==arr[k-1]) continue;
                int l =n-1;
                int j = k+1;
                while(j<l){
                    long sum = (long) arr[i]+arr[j]+arr[k]+arr[l];
                    if(sum==target){
                        ans.add(Arrays.asList(arr[i],arr[j],arr[k],arr[l]));
                        j++;
                        l--;
                        while(j<l && arr[j]==arr[j-1])j++;
                        while (j<l && arr[l]==arr[l+1]) l--;

                    }else if(sum>target){
                        l--;
                    }else{
                        j++;
                    }
                }
            }
        }
        return ans;
    }
}
