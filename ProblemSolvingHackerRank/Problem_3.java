import java.util.Scanner;

public class  Problem_3{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read Alice's ratings
        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = scanner.nextInt();
        }
        
        
        int[] b = new int[3];
        for(int i=0; i<3; i++) {
            b[i] = scanner.nextInt();
        }
        
        int alicePoints = 0;
        int bobsPoints = 0;
        
        for(int i=0; i<3; i++) {
            if (a[i] > b[i]) {
                 alicePoints++;
            } else if( a[i] < b[i] ){
                bobsPoints++;
            }
        }
        
        
        System.out.println(alicePoints + " " + bobsPoints);
        
        
        
    }
}
