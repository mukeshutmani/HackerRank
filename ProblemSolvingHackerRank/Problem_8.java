import java.util.Arrays;
import java.util.Scanner;
 public class Problem_8{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        
        int n = 5;
        int[] arr = new int[n];
        for(int i =0; i<n; i++) {
            arr[i] += scn.nextInt();
        }
    
        Arrays.sort(arr);

    long minSum = 0;
    // long sum2 =0;    
    for(int j=0; j<4; j++ ) {
         minSum += arr[j];    
    }

    long maxSum =0;
    for(int i=1; i<5; i++) {
        maxSum += arr[i];
    }
     
    System.out.print(minSum +" "+ maxSum);
    
    
   
        

    }
}
