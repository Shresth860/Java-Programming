public class IsValidPalindrome
{
    public static void main(String[] args) {
        String s ="A man, a plan, a canal: Panama";

        // special line which means if an String contain anything except digit and word just replace with nothing.
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                System.out.println("false");
            }
            i++;
            j--;
        }
        System.out.println("true");
    }
}
