import java.util.ArrayList;
import java.util.Stack;

public class NearestSmallestElement {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(4);
        A.add(5);
        A.add(2);
        A.add(10);
        A.add(8);
        ArrayList<Integer> ans = nearSmallest(A);
        System.out.println(ans);
    }
    static ArrayList<Integer> nearSmallest(ArrayList<Integer> A){
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int n = A.size();
        for(int x : A){
            while(!st.isEmpty() && st.peek()>=x){
                st.pop();
            }
            if(st.isEmpty()){
              ans.add(-1);
            }else{
                ans.add(st.peek());
            }
            st.push(x);
        }
        return ans;
    }
}
