public class PrintIncreasingDecreasingUsingRecursion {
    public static void main(String[] args) {
        int n =5;
        printIncDec(n);
    }
    static void printIncDec(int n){
        if(n==0) return;
        System.out.println(n);
        printIncDec(n-1);
        System.out.println(n);
    }
}
// output : 5 4 3 2 1 1 2 3 4 5