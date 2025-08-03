public class SearchInChar{
    public static void main(String[] args){
       String str ="Shresth";
       char target='w';
       System.out.println(LinearSearch(str.toCharArray(),target));
    }
    static int LinearSearch(char[] str , char target){
        for(int i=0;i<str.length;i++){
           if(str[i]==target){
            return i;
           }
        }
        return -1;
    }
}