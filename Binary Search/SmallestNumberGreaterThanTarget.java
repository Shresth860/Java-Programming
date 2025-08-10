// leetcode 744
public class SmallestNumberGreaterThanTarget{
    public static void main(String[] nums){
        char[] letters ={'c','f','i'};
        char target='a';
        char ans =FindNumber(letters , target);
        System.out.println(ans);
    }
    public static char FindNumber(char[] letters , char target){
        int st=0,end=letters.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(letters[mid]<target){
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return letters[st%letters.length];
    }
}