import java.util.Arrays;

public class HIndex {
    public static void main(String[] args) {
        int[] citation = {3,0,6,1,5};
        int n = citation.length;
        int ans=0;
        Arrays.sort(citation);
        for(int i=1;i<n;i++){
            if(citation[i]>i){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
