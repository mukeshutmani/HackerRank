import java.util.Scanner;

public class Problem_11{

public static void main(String[] args) {
     Scanner scn = new Scanner(System.in); 

     String sentence = scn.nextLine();
        sentence = sentence.toLowerCase();
        
     boolean pangram = isPangram(sentence);
       
     if(pangram){
             System.out.println("pangram");
     } else {
        System.out.println("not pangram");
     } 


    
}

public static boolean isPangram(String sentence){

    boolean[] letterPresent = new boolean[26];


    for(int i=0; i<sentence.length(); i++){
       char ch = sentence.charAt(i);
       if(ch>='a' && ch<='z'){
        letterPresent[ch - 'a'] = true;
       }
    }

    for(boolean present:letterPresent){
        if(!present){
            return false;
        }
    }
    
    return true;
}

}
