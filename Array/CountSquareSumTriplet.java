public class CountSquareSumTriplet {
    public static void main(String[] args) {
        int n =5;
        System.out.println(sumTri(n));
    }
    static int sumTri(int n ){
        int ans =0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++) {
                int sum = (i*i)+(j*j);
                int k = (int)Math.sqrt(sum);
                if(k*k==sum && k<=n ){
                    ans++;
                }
            }
        }
        return ans;
    }
}
