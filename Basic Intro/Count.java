public class Count{
    public static void main(String[] args) {
        int[] arr={1,3,8,5,7,8,7,8,7,9};
        int n=arr.length;
        int freq=0;
        for(int i=0;i<n;i++){
            if(arr[i]==7){
                freq++;
            }
        }
        System.out.println("Frequency of 7 is "+freq);

    }
}