public class ReverseVovelOfString {
    public static void main(String[] args) {
        String s = "IceCream";
        int len = s.length();
        System.out.println(Reverse(s,len));
    }
    static String Reverse(String s , int len){
        int i=0,j=len-1;
        char[] ch = s.toCharArray();
        while(i<=j && !isVovel(ch[i])) i++;
        while(i<=j && !isVovel(ch[j])) j--;
        if(i<j){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        return new String(ch);
    }
    static boolean isVovel(char ch){
        String Vovel="AEIOUaeiou";
        return Vovel.indexOf(ch)!=-1;
    }
}
