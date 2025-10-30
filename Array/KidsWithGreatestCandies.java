import java.util.ArrayList;

public class KidsWithGreatestCandies {
    public static void main(String[] args) {
        int[] arr = {2,5,3,1,3};
        int extraCandies =3;
        Candies(arr, extraCandies);
    }
    static void Candies(int[] arr , int extraCandies){
        ArrayList<String> l = new ArrayList<>();

        // adding the candies
        for(int i=0;i<arr.length;i++){
            int sum = arr[i]+extraCandies;
            arr[i]=sum;
            for(int j=0;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    l.add("true");
                }else{
                    l.add("false");
                }
            }
        }
        System.out.println(l);
    }
}
