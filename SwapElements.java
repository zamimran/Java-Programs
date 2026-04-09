import java.util.Scanner;

public class SwapElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter first position: ");
        int pos1 = sc.nextInt();

        System.out.print("Enter second position: ");
        int pos2 = sc.nextInt();

        if(pos1<0 || pos1>=n || pos2<0 || pos2>=n) {
            System.out.print("Invalid position");
        }
        else {
            int temp = arr[pos1];
            arr[pos1] = arr[pos2];
            arr[pos2] = temp;
        }

        System.out.print("Array after swapping: ");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+ " ");
        }
        sc.close();
    }
}
