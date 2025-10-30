public class ReversePair {
        public static void main(String[] args) {
            int[] arr = {1, 3, 2, 3, 1};
            int st = 0;
            int end = arr.length - 1;
            System.out.println("Inversion Count: " + mergeSort(arr, st, end));
        }

        static void merge(int[] arr, int st, int mid, int end) {
            int[] temp = new int[end - st + 1];
            int i = st, j = mid + 1, k = 0;
            int inCount = 0;

            // Merge logic
            while (i <= mid && j <= end) {
                if (arr[i] <= arr[j]) {
                    temp[k++] = arr[i++];

                } else {
                    temp[k++] = arr[j++];
                }
            }

            // Copy remaining elements from left
            while (i <= mid) {
                temp[k++] = arr[i++];
            }

            // Copy remaining elements from right
            while (j <= end) {
                temp[k++] = arr[j++];
            }

            // Copy sorted elements back to arr
            for (int p = 0; p < temp.length; p++) {
                arr[st + p] = temp[p];
            }
        }
       static int CountPair(int[] arr , int st , int end , int mid){
            int count=0;
            int j =mid+1;
            for(int i=st;i<=mid;i++){
                while(j<=end && (long) arr[i]>2L*arr[j]){
                    j++;
                }
                count+=(j-(mid+1));
            }
            return count;
       }
        static int mergeSort(int[] arr, int st, int end) {
            int count = 0;
            if (st < end) {
                int mid = st + (end - st) / 2;
                count += mergeSort(arr, st, mid);
                count += mergeSort(arr, mid + 1, end);
                count+=CountPair(arr,st,end,mid);
                 merge(arr, st, mid, end);
            }
            return count;
        }
}
