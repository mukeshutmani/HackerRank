import java.util.Scanner;
import java.util.Arrays;

public class Problem_9{
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
         
    int age = scn.nextInt();
    int[] candles = new int[age];

    for(int i=0; i<age; i++) {
         candles[i] += scn.nextInt();
    }

    
    int tallestCandle = 0;
    Arrays.sort(candles);
    for(int i=0; i<age; i++) {
        if(candles[age-1] == candles[i] ){
            tallestCandle++;
        }
    }

    System.out.println(tallestCandle);

    }


}
