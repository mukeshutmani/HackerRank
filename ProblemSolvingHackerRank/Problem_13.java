import java.util.Scanner;


public class Problem_13{

    public static void main( String[] args) {
    
       
        String result = countApplesAndOranges();
        System.out.println(result);

    }

    public static String countApplesAndOranges(){
        Scanner scn = new Scanner(System.in);
      
        // System.out.println("Enter home distance s and t:");
        int s = scn.nextInt();
        int t = scn.nextInt();
   
        // System.out.println("Apple and orange tree location");
   
        int a = scn.nextInt();
        int b = scn.nextInt();
        
        // System.out.println("Enter no of apples and oranges");
        int apples = scn.nextInt();
        int oranges = scn.nextInt();
       
    //    System.out.println("Enter distance of apples");
       int[] appleDis = new int[apples];
       for( int i=0; i<apples; i++){
             appleDis[i] = scn.nextInt();
       }
     
    //    System.out.println("Enter distance of oranges");
       int[] orangeDis = new int[oranges];
       for( int i=0; i<oranges; i++){
             orangeDis[i] = scn.nextInt();
       }

    int[] appleNewDis = new int[apples];
    for(int j=0; j<apples; j++) {
       appleNewDis[j] = appleDis[j]+a;
    }

    int[] orangeNewDis = new int[oranges];
    for(int j=0; j<oranges; j++) {
       orangeNewDis[j] = orangeDis[j]+b;
    }

         int total_apple =0;
         int total_orange =0;
    

    for(int apple:appleNewDis){
        if( apple>=s && apple<=t){
            total_apple++;
        }
    }


    for(int orange:orangeNewDis) {
        if(orange>=s && orange<=t){
           total_orange++;
        }
    }
  
    return total_apple+"\n"+total_orange;

    }

}
