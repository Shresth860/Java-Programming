import java.util.*;
public class FairCandySwap{
    public static void main(String[] args){
        int[] Alice={1,1};
        int[] Bob={2,2};
        System.out.println(Arrays.toString(SwapingCandy(Alice,Bob)));
    }
    public static int[] SwapingCandy(int[] Alice , int[] Bob){
        // First Calculate Alice Candy sum
        int SumAlice=0;
        for(int nums : Alice){
            SumAlice+=nums;
        }
        //  Calculate Bob Candy sum
        int SumBob=0;
        for(int nums : Bob){
            SumBob+=nums;
        }

        // Calculate Diff
        int diff = (SumAlice-SumBob)/2;

        // sort Alice for BS
        Arrays.sort(Alice);

        for(int nums:Bob){
            int y = nums + diff;
            if(BS(y,Alice)){
                return new int[] {y,nums};
            }
        }
        return new int[]{-1,-1};
    }
    public static boolean BS(int y , int[] Alice){
        int st=0,end=Alice.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(Alice[mid]==y){
                return true;
            }else if(Alice[mid]<y){
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return false;
    }
}
