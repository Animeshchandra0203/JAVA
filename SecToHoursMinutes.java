import java.util.*;

public class SecToHoursMinutes {
    int[] toHoursMinutes(int sec){
      int rem;
       int hours=0, minutes=0, seconds=0;
      if(sec>=3600){
           hours = sec/(60*60);
        }
        rem = sec%3600;
        if(rem > 0){
           minutes = rem/60;
        }

        rem = rem%60;
        if(rem > 0){
           seconds = rem;
        }
        return new int[]{hours,minutes,seconds};
        }

    public static void main(String[] args) {
        System.out.println("enter time in seconds: ");
        Scanner sc = new Scanner(System.in);
        int sec = sc.nextInt();
        
        SecToHoursMinutes t1 = new SecToHoursMinutes();
        int[] time = t1. toHoursMinutes(sec);

        System.out.println(time[0] + " hours, " + time[1] + " minutes, " + time[2] + " seconds,");

    }
}
