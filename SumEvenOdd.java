public class SumEvenOdd {
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 30, 35};

        int evenSum = 0;
        int oddSum = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenSum += num; 
            } else {
                oddSum += num;  
            }
        }
        System.out.println("Sum of Even Numbers: " + evenSum);
        System.out.println("Sum of Odd Numbers: " + oddSum);
    }
}
