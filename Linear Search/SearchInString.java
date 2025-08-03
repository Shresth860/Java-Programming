public class SearchInString{
    public static void main(String[] args){
        String[] arr={"Shresth" , "Ramesh","Rahul","vibhor","sachin","kishor","kishan","kumar"};
        String target = "kumar";
       int ans= LinearSearch(arr,target);
       System.out.println(ans);
    }
    static int LinearSearch(String[] arr , String target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}