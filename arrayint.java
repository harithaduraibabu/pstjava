import java.util.Scanner;
import java.util.Arrays;

public class arrayint {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read number of elements
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Read K value
        int k = sc.nextInt();

        // Sort the array
        Arrays.sort(arr);

        // Check if K is valid
        if (k > 0 && k <= n) {
            System.out.println("Kth smallest element is: " + arr[k - 1]);
        } else {
            System.out.println("Invalid value of K");
        }

        sc.close();
    }
}
