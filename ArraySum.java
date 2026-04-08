import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        // Input array elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate sum
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        // Output result
        System.out.println("Sum of array elements = " + sum);

        sc.close();
    }
}
