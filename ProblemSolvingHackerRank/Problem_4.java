import java.util.Scanner;

public class Problem_4{

    // Function to compute the sum of array elements
    static long aVeryBigSum(int[] ar) {
        long sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of elements
        int n = scanner.nextInt();
        int[] ar = new int[n];
        
        // Read the elements into the array
        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
        }
        
        // Calculate the sum of the elements
        long result = aVeryBigSum(ar);
        
        // Print the result
        System.out.println(result);
        
        scanner.close();
    }
}
