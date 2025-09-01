//import java.util.Arrays;  // Optimised Approach
//
//public class SuccessfulPairOfSpellsAndPotions {
//    public static void main(String[] args) {
//        int[] spells = {5,1,3};
//        int[] potions ={1,2,3,4,5};
//        Arrays.sort(potions);
//        int success=7;
//        int n = potions.length;
//        int m =spells.length;
//        int[] ans = new int[3];
//        int index=0;
//        for(int i=0;i<m;i++){
//            int spell=spells[i];
//            int left=0,right=n-1,firstValid=n;
//            while(left<=right){
//                int mid=left+(right-left)/2;
//                long Product = (long) spell*potions[mid];
//                if(Product>=success){
//                    firstValid=mid;
//                    right=mid-1;
//                }else{
//                    left=mid+1;
//                }
//            }
//           ans[i]=n-firstValid;
//        }
//        System.out.println(Arrays.toString(ans));
//    }
//}
import java.util.Arrays;  // Brute-force approach
public class SuccessfulPairOfSpellsAndPotions {
    public static void main(String[] args) {
        int[] spells = {5,1,3};
        int[] potions ={1,2,3,4,5};
        int success=7;
        int n = potions.length;
        int m =spells.length;
        int[] ans = new int[m];
//        int index=0;
        for(int i=0;i<m;i++){
            int count=0;
            for(int j=0;j<n;j++){
                int spell = spells[i]*potions[j];
                if(spell>=success){
                   count++;
                }
            }
            ans[i]=count;
        }
        System.out.println(Arrays.toString(ans));
    }
}