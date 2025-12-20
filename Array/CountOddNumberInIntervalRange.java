public class CountOddNumberInIntervalRange {
    public static void main(String[] args) {
        int low =3;
        int high=7;
        int cnt=0;
        int i=low;
        int j=high;
        while(i<=j){
            if(i%2!=0){
                cnt++;
            }
            i++;
        }
        System.out.println(cnt);
    }
}
