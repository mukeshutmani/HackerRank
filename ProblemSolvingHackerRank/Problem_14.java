
import java.util.Scanner;

public class Problem_14{
       public static void main(String[] args){
          
        Scanner obj = new Scanner(System.in);
        int x1 = obj.nextInt();
        int v1 = obj.nextInt();
        int x2 = obj.nextInt();
        int v2 = obj.nextInt();
         
        if(v1 = v2 ){
           int n = (x2-x1)/(v1-v2);  
            if(n>0 && ((x2-x1)%(v1-v2)) == 0 ) {
                  System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        } else{
            System.out.println("NO");
        }
       
}
}