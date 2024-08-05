










import java.util.Scanner;

public class Problem_16 {

   public static String breakingRecords(int[] scores){

            int highestScore = scores[0];
            int lowestScore  = scores[0];
            int winPoint = 0;
            int losePoint  = 0; 
   
        for(int i=1; i<scores.length; i++) {
               if( scores[i] > highestScore) {
                    highestScore = scores[i];
                    winPoint++;
               } else if( scores[i] < lowestScore ){
                 lowestScore = scores[i];
                  losePoint++;
               }
           }
        
           return winPoint+" "+losePoint;

         } 

        
   

    public static void main(String[] args) {
        
      Scanner obj = new Scanner(System.in);
      int n = obj.nextInt();
     


        int[] scores = new int[n];
        for(int i=0; i<n; i++) {
            scores[i] = obj.nextInt();
        }
      
      String result = breakingRecords(scores);
      System.out.println(result);
       
        
      
        
    }
    

}



