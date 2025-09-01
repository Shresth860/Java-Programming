import java.util.Arrays;
import java.util.Vector;

class Main {
    public static void main(String[] args) {
        int arr[] ={1,3,4,5};
        int k =2;
        int n =arr.length;
        Vector<Integer> ar = new Vector<>();
        for(int i=0;i<k;i++){   // this function will stor element till kth position in vector.
            ar.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++){  // this function is used to swap element by one place to left
            arr[i-k]=arr[i];
        }
        for(int i=0;i<k;i++){  // this function will finally add the element at last
            arr[n-k+i]=ar.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }

}
