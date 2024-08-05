import java.util.*;

public class  Problem_15 
{

    // Method to calculate GCD of two numbers
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to calculate LCM of two numbers
    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    // Method to calculate GCD of an array
    public static int gcdArray(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = gcd(result, arr[i]);
            if (result == 1) {
                return 1; // If GCD becomes 1, return early
            }
        }
        return result;
    }

    // Method to calculate LCM of an array
    public static int lcmArray(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = lcm(result, arr[i]);
        }
        return result;
    }

    // Method to find numbers between two sets
    public static int getTotalX(int[] a, int[] b) {
        int lcmA = lcmArray(a);
        int gcdB = gcdArray(b);

        int count = 0;
        for (int i = lcmA; i <= gcdB; i += lcmA) {
            if (gcdB % i == 0) {
                count++;
            }
        }
        return count;
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input for array a
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        // Read input for array b
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }

        // Get the result and print it
        int totalX = getTotalX(a, b);
        System.out.println(totalX);

        scanner.close();
    }
}
