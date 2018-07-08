import java.util.Scanner;

enum Task_16_5_Day {
    MONDAY, TUESDAY, WEDNESDAY, THIRSDAY, FRIDAY, SUTURDAY, SUNDAY
}

public class Task_16_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String myDay;
        Task_16_5_Day theDay;

        System.out.print("Enter day of week: ");
        myDay = sc.next();
        System.out.println("1. myDay = " + myDay);

        myDay = myDay.toUpperCase();
        System.out.println("2. myDay = " + myDay);

        theDay = Task_16_5_Day.valueOf(myDay);

        switch (theDay) {
            case MONDAY: 
                System.out.println("You entered Monday.");
                break;
            case TUESDAY: 
                System.out.println("You entered Tuesday.");
                break;
            case WEDNESDAY: 
                System.out.println("You entered Wednesday.");
                break;
            case THIRSDAY: 
                System.out.println("You entered Thirsday.");
                break;
            case FRIDAY: 
                System.out.println("You entered Friday.");
                break;
            case SUTURDAY: 
                System.out.println("You entered Saturday.");
                break;
            case SUNDAY: 
                System.out.println("You entered Sunday.");
                break;           
        }
        sc.close();        
    }
}