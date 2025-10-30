public class CountInversion {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 1};
        int st = 0;
        int end = arr.length - 1;
        System.out.println("Inversion Count: " + mergeSort(arr, st, end));
    }

    static int merge(int[] arr, int st, int mid, int end) {
        int[] temp = new int[end - st + 1];
        int i = st, j = mid + 1, k = 0;
        int inCount = 0;

        // Merge logic
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                inCount += (mid - i + 1); // count inversions
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

        return inCount;
    }

    static int mergeSort(int[] arr, int st, int end) {
        int count = 0;
        if (st < end) {
            int mid = st + (end - st) / 2;
            count += mergeSort(arr, st, mid);
            count += mergeSort(arr, mid + 1, end);
            count += merge(arr, st, mid, end);
        }
        return count;
    }
}
