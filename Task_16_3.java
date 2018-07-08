import java.util.Scanner;

public class Task_16_3 {

    public static void main(String[] args) {
        String month;
        int year;
        int numDays = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month: ");
        month = sc.next();

        System.out.print("Enter year: ");
        year = sc.nextInt();

        switch (month) {
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                numDays = 31;
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                numDays = 30;
                break;
            case "February":
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
                    numDays = 29;
                } else {
                    numDays = 28;
                }
                break;
            default: 
                System.out.println("Unexisting month");
                break;
        }
        System.out.println("The amount of days = " + numDays);
        sc.close();        
    }       
}