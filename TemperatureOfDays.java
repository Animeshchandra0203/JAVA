import java.util.*;

public class TemperatureOfDays {

    public int tempInput(String[][] arr, Scanner sc){
        System.out.print("Enter day: ");
        String day = sc.next().toLowerCase();

        for(int i = 0; i < 7; i++){
            if(arr[i][0].toLowerCase().equals(day)){
                System.out.print("Enter Maximum temperature: ");
                arr[i][2] = sc.next();

                System.out.print("Enter Minimum temperature: ");
                arr[i][1] = sc.next();

                return i;
            }
        }
        System.out.println("Invalid day!");
        return -1;
    }

    public void displayParticularDay(String[][] arr, Scanner sc){
        System.out.print("Enter day to display: ");
        String day = sc.next().toLowerCase();

        for(int i = 0; i < 7; i++){
            if(arr[i][0].toLowerCase().equals(day)){
                System.out.println("DAY\tMAX\tMIN");
                System.out.println(arr[i][0] + "\t" + arr[i][2] + "\t" + arr[i][1]);
                return;
            }
        }
        System.out.println("Day not found!");
    }

    public void displayAllDays(String[][] arr){
        System.out.println("DAY\tMAX\tMIN");
        for(int i = 0; i < 7; i++){
            System.out.println(arr[i][0] + "\t" + arr[i][2] + "\t" + arr[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean running = true;

        String[][] temperature = new String[7][3];

        temperature[0][0] = "Monday";
        temperature[1][0] = "Tuesday";
        temperature[2][0] = "Wednesday";
        temperature[3][0] = "Thursday";
        temperature[4][0] = "Friday";
        temperature[5][0] = "Saturday";
        temperature[6][0] = "Sunday";

        TemperatureOfDays d1 = new TemperatureOfDays();

        while(running){
            System.out.println("\nCHOICES:-");
            System.out.println("1.) Enter Temperature");
            System.out.println("2.) Display Particular Day");
            System.out.println("3.) Display All Days");
            System.out.println("4.) Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    d1.tempInput(temperature, sc);
                    break;
                case 2:
                    d1.displayParticularDay(temperature, sc);
                    break;
                case 3:
                    d1.displayAllDays(temperature);
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}