public class CopyArrayExample1 {
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};
        int[] copy = new int[original.length];

        for(int i=0; i<original.length; i++) {
            copy[i] = original[i];
        }

        System.out.print("This is the copied array: ");
        for (int i=0; i<copy.length; i++) {
            System.out.print(copy[i]+ " ");
        }
    }
}
