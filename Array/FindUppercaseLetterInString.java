public class FindUppercaseLetterInString {
    public static void main(String[] args) {
        String s ="greeKs";
        System.out.println(uppercase(s));
    }
    static char uppercase(String s){
        return helper(s ,0);
    }
    static char helper(String s , int i){
        if(s.charAt(i)=='\0'){ // null character
            return 0;
        }
        if(Character.isUpperCase(s.charAt(i))){
            return s.charAt(i);
        }
        try {
            return helper(s,i+1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
