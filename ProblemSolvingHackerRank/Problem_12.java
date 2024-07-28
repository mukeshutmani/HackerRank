import java.util.Scanner;


public class Problem_12 {

  public static int[] gradingStudent(int[] grade) {
    int[] gradeValue = new int[grade.length]; 

      for(int i=0; i<grade.length; i++) {
         if(grade[i]<38){
             gradeValue[i] = grade[i];
         } 
         else if(grade[i]%5 == 0){
            gradeValue[i] = grade[i];
         }  
         else if (grade[i]%5 != 0){
             int a = grade[i]+1;
             int b = grade[i]+2;
                if(a%5==0){
                   gradeValue[i] = a;
                }  else if (b%5==0){
                     gradeValue[i] = b;
                  }    else if (grade[i]%5 != 0){
                          gradeValue[i] = grade[i];
                      }
         }
      }

      return gradeValue;
  }


    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
 
       int n = scn.nextInt();

       int[] grade = new int[n]; 

       for(int i=0; i<n; i++){
         int input = scn.nextInt();
               grade[i] = input;
         
       }

      int[] result = gradingStudent(grade);
      for(int i=0; i<n; i++){
         System.out.println(result[i]);
      }
      
      
    

    }
}