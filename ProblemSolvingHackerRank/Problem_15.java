

import java.util.Scanner;

public class Problem_15 {

    public static void main(String[] args) {
        
      Scanner obj = new Scanner(System.in);
      int a = obj.nextInt();
      int b = obj.nextInt();

      
      int[] arrOne = new int[a];
      for(int i=0; i<a; i++) {
          arrOne[i] = obj.nextInt();
        }

        int[] arrTwo = new int[b];
        for(int i=0; i<b; i++) {
            arrTwo[i] = obj.nextInt();
        }


        int x = arrOne[a-1];
        int y = arrTwo[0];
        
       int count=0;
       while(x<=y) {
        int temp = 0;
     
        for(int i=0; i<a; i++){
            if(x%arrOne[i] != 0) {
                temp=1;
                break;
            }   
        }
        if(temp == 0 ) {

            for(int i=0; i<b; i++){
                if(arrTwo[i]%x != 0) {
                    temp=1;
                    break;
                }   
            }
        }

        
        if(temp==0){
            count++;
        }
        x++;

    }

        System.out.println("score:"+ count);
        
    }
    

}