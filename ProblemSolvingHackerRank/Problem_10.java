import java.util.Scanner;

public class Problem_10{

public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);

     String simpleTime = scn.nextLine();

     String result = timeConversion(simpleTime);
     
     System.out.println(result);


}

private static String timeConversion(String simpleTime) {
     
     String[] timeParts = simpleTime.split("(?=PM|AM)");
     String time = timeParts[0];
     String period = timeParts[1];

    //  time  split
     String[] timesplit = time.split(":");

     int hour = Integer.parseInt(timesplit[0]);
     int minute = Integer.parseInt(timesplit[1]);
     int second = Integer.parseInt(timesplit[2]);

     if(hour != 12 && period.equals("PM")){
        hour+=12;
     } else if( period.equals("AM") && hour==12){
        hour = 0;
     }


     String hourFormatted = String.format("%02d",hour);
     String minuteFormatted = String.format("%02d",minute);
     String secondFormated = String.format("%02d",second);

     return hourFormatted +":"+ minuteFormatted +":"+secondFormated;
     
  
}


}
