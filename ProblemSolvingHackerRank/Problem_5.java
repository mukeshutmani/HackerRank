
import java.util.Scanner;

public class Problem_5{
    static int diagonalDifference (int[][] arr){
        
        int n = arr.length;
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        
        
        for(int i=0; i<n; i++) {
            primaryDiagonalSum += arr[i][i];
            secondaryDiagonalSum += arr[i][n-i-1];
        }
        
        return Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
        
        
    }
    
    
   public static void main (String[] args){
       Scanner scanner = new Scanner(System.in);
       
       int n = scanner.nextInt();
       int[][] arr = new int[n][n];
       
       for(int i=0; i<n; i++) {
           for(int j=0; j<n; j++){
               arr[i][j] = scanner.nextInt();
           }
       }
       
       int result = diagonalDifference(arr);
       
       System.out.println(result);
       
   } 
}
