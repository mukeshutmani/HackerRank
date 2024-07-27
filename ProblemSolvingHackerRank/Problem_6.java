import java.util.Scanner;

public class Problem_6{

    public static void plusMinus(int[] arr){

          int positive = 0;
          int negative = 0;
          int zero = 0;

           for(int j=0; j<arr.length; j++){

                if(arr[j]>0){
                    positive++;
                } else if(arr[j]<0){
                    negative++;
                } else if(arr[j] == 0){
                    zero++;
                }
           }   
           
           int n = arr.length;
           System.out.printf("%.6f%n",(double) positive/n);
           System.out.printf("%.6f%n",(double) negative/n);
           System.out.printf("%.6f%n",(double) zero/n);
 
    }

    
    public static void main(String[] args) {
         
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] += scn.nextInt();
        }

        plusMinus(arr);
       
          
        
    }
    
}
