import java.util.Vector;

public class AddingOne {
    public static void main(String[] args) {
        int[] arr ={1,2,3,9};
        int n = arr.length;

        Vector<Integer> ans = addOne(arr,n);
        System.out.println(ans);
    }
    static Vector<Integer> addOne(int[] arr , int n ) {
        int carry = 1;
        Vector<Integer> ans = new Vector<>();
       for(int i=n-1;i>=0;i--){
           int sum=arr[i]+carry;
           ans.add(0,sum%10);
           carry=sum/10;
       }
       if(carry>0){
           ans.add(0,carry);
       }
       return ans;
    }
}
