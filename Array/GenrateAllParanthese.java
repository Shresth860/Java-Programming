import java.util.Stack;

public class GenrateAllParanthese {
    public static void main(String[] args) {
        String A ="(){}[]";
        System.out.println(generateParanthese(A));
    }
    static Boolean generateParanthese(String A){
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);

            // If opening, push to stack
            if (ch == '(' || ch == '{' || ch == '[') {  // it will only add the starting paranthese not ending paranthese.
                st.push(ch);
            }
            // If closing, check matching
            else {
                if (st.isEmpty()) return false;

                char top = st.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // Stack must be empty in the end
        return st.isEmpty();
    }
}
