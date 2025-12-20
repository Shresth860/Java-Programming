//import java.util.ArrayList;
import java.util.Arrays;
//import java.util.List;

public class TripletWithSmallerSum {
    public static void main(String[] args) {
        int sum = 2;
        int n = 4;
        int arr[] = {-2, 0, 1, 3};
        System.out.println(tripletSum(sum, n, arr));
    }

    static int tripletSum(int sum, int n, int[] arr) {
        int cnt = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            int left=i+1;
            int right = n - 1;
            while(left<right){
                int ActualSum = arr[i] + arr[left] + arr[right];
                if (ActualSum < sum) {
                    cnt+=(right-left);
                    left++;
                } else {
                    right--;
                }
            }
        }
        return cnt;
    }
}
