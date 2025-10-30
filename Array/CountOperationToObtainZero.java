public class CountOperationToObtainZero
{
    public static void main(String[] args) {
        int num1=10,num2=10;
        System.out.println(ObtainZero(num1,num2));
    }
    static int ObtainZero(int num1 , int num2){
        int cnt=0;
        while(num1!=0 && num2!=0){
            if(num1>num2){
                num1=num1-num2;
                cnt++;
            }else{
                num2=num2-num1;
                cnt++;
            }
        }
        return cnt;
    }
}
