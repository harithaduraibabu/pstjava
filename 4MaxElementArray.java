import java.util.Scanner;

public class MaxElementArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read number of elements
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Assume first element is maximum
        int max = arr[0];

        // Find maximum element
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Print result
        System.out.println("Maximum element is: " + max);

        sc.close();
    }
}
