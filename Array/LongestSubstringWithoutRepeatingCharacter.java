import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(LongestSub(s));
    }
    static int LongestSub(String s){
        int n =s.length();
        Set<Character> str = new HashSet<>();
        int left=0,right=0,maxLen=0;
        while (right<n){
            char c = s.charAt(right);
            if(!str.contains(c)){
               str.add(c);
               right++;
               maxLen=Math.max(maxLen,right-left);
            }else{
                str.remove(s.charAt(left));
                left++;
            }
        }
        return maxLen;
    }
}
