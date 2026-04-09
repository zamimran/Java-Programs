import java.util.Scanner;
public class CountNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int positive = 0, negative = 0, zero = 0;

        int[] arr = new int[n];

        System.out.println("Enter all the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                positive++;
            }
            else if (arr[i] < 0) {
                negative++;
            }
            else {
                zero++;
            }
        }
        System.out.println("The numbers of positive elements are: " +positive);
        System.out.println("The numbers of negative elements are: " +negative);
        System.out.println("The numbers of zero elements are: " +zero);
    }
}
