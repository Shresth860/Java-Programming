import java.sql.SQLOutput;
import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int m=3;
        int[] nums2={2,5,6};
        int n=3;
        System.out.println(Arrays.toString(SortedArray(nums1,m,nums2,n)));
    }
    static int[] SortedArray(int[] nums1, int m , int[] nums2 , int n){
        int[] ans =  new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                ans[k++]=nums1[i++];
            }else{
                ans[k++]=nums2[j++];
            }
        }
        while (i < m) {
            ans[k++] = nums1[i++];
        }
        while (j < n) {
            ans[k++] = nums2[j++];
        }
        return ans;
    }
}
