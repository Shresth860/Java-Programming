import java.util.*;
public class IntersectionOf2DArray{
    public static void main(String[] args){
        int[] nums1={1,2,2,1};
        int[] nums2={2,2,1};
        System.out.println(Arrays.toString(Intersection(nums1,nums2)));
    }
    public static int[] Intersection(int[] nums1 , int[] nums2){
        // first sort the array
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0,j=0;
        // initialize a ArrayList
        ArrayList<Integer> res = new ArrayList<>();

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                if(res.isEmpty() || res.get(res.size()-1)!=nums1[i]){ // to avoid duplicate
                res.add(nums1[i]);
                }
                i++;
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }

        // convert ArrayList to int[]
        int[] ans = new int[res.size()];
        for(int k=0;k<res.size();k++){
            ans[k] = res.get(k);
        }
        return ans;
    }
}