import java.util.ArrayList;
import java.util.Stack;

public class CountOfSmallerNumberAfterSelf {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(); // 5261
        A.add(5);
        A.add(2);
        A.add(6);
        A.add(1);
//        A.add(8);
        ArrayList<Integer> ans = SmallestElement(A);
        System.out.println(ans);
    }
     static ArrayList<Integer> SmallestElement(ArrayList<Integer> A) {
         Stack<Integer> st = new Stack<>();
         ArrayList<Integer> ans = new ArrayList<>();
         int n = A.size();
         int count=0;
         for(int i=n-1;i>=0;i--){
             if(st.isEmpty()){
                 st.add(A.get(i));
                 ans.add(A.get(i));
             }
             while(!st.isEmpty()) {
                 if (st.peek() >= i) {
                     count++;
                     ans.add(count);
                 } else {
                     ans.add(count);
                 }
             }

//             st.push(x);
         }
         return ans;
    }
}
