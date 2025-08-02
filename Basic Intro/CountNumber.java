public class CountNumber{
    public static void main(String[] args) {
        int n=12452412;
        int i=2;
        int count=0;
        while(n>0){
            int rem=n%10;
            if(rem==i){
                count++;
            }
            n=n/10;
        }
        System.out.println("frequency of "+i +" is "+count);
    }
}