import java.util.Scanner;
public class Input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // create a size of array
        System.out.println("Enter size of Array ::");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // input array elements
        System.out.println("Enter Array Elements ::");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // print array elements
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}