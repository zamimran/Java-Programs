public class CopyArrayExample {
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};
        int[] copy = new int[original.length];

        System.arraycopy(original, 0, copy, 0, original.length);

        System.out.println("Copied array elements:");
        for (int num : copy) {
            System.out.print(num + " ");
        }
    }
}
