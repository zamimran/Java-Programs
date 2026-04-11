import java.util.Arrays;
public class CopyArrayExample3 {
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};
        int[] copy = Arrays.copyOf(original, original.length);

        System.out.print("This is the copied array: ");
        for (int num : copy) {
            System.out.println("Copied array = " +num);
        }
    }
}
