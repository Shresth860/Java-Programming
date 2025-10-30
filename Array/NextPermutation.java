    import java.util.Arrays;

    public class NextPermutation {
        public static void main(String[] args) {
            int[] nums ={1,2,3};
            Permutation(nums);
        }
        static void Permutation(int[] nums){
            int n = nums.length;
            int pivot =-1;

            // step 1 : find pivot point
            for(int i=n-2;i>=0;i--){
                if(nums[i]<nums[i+1]){
                    pivot=i;
                    break;
                }
            }
            if(pivot==-1){
                Arrays.sort(nums);
                return ;
            }
            // step 2: find the Right most element >  pivot then swap both
            for(int i=n-1;i>pivot;i--){
                if(nums[i]>nums[pivot]){
                    int temp = nums[i];
                    nums[i]=nums[pivot];
                    nums[pivot]=temp;
                    break;
                }
            }
           // step 3: Reverse (Pivot+1) to (n-1)
            int i=pivot+1;
            int j =n-1;
            while(i<=j){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
            System.out.println(nums);
        }
    }
