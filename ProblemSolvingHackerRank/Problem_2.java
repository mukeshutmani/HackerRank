


import java.util.Scanner;

public class Problem_2{

public static void main(String[] args) {
     Scanner scn = new Scanner(System.in); 
     
    int n = scn.nextInt();
    int[] arr = new int[n];
    
    for(int i=0; i<n; i++){
        arr[i]+=scn.nextInt();
    }
   
   int sum =0;
   for(int j=0; j<arr.length; j++){
        sum+=arr[j];
   }
   
   System.out.println(sum);
   
    
}

}














