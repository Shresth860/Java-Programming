import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueLengthPalindronic3Subsequence {
    public static void main(String[] args) {
        String s = "aabca";
        char[] a = s.toCharArray();
        System.out.println(UniqueLength(s.toCharArray()));
    }
    static int UniqueLength(char[] a){
        int[] first = new int[26];
        int[] last = new int[26];
        Arrays.fill(first, -1);
        Arrays.fill(last, -1);

        for (int i = 0; i < a.length; i++) {
            int curr = a[i] - 'a';
            if (first[curr] == - 1) {
                first[curr] = i;
            }

            last[curr] = i;
        }

        int ans = 0;
        for (int i = 0; i < 26; i++) {
            if (first[i] == -1) {
                continue;
            }

            Set<Character> st = new HashSet();
            for (int middle = first[i] + 1; middle < last[i]; middle++) {
                st.add(a[middle]);
            }

            ans += st.size();
        }

        return ans;
    }
}
