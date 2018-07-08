import java.util.Scanner;

public class Task_16_4 {
    public static void main(String[] args) {
        Task_16_4_Month month;
        int year;
        int numDays = 0;
        Scanner sc = new Scanner(System.in);
        
        month = Task_16_4_Month.APRIL;

        System.out.print("Enter year: ");
        year = sc.nextInt();

        switch (month) {
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER:
                numDays = 31;
                break;
            case APRIL:
            case JUNE:
            case SEPTEMBER:
            case NOVEMBER:
                numDays = 30;
                break;
            case FEBRUARY:
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
        System.out.println("Amount of days = " + numDays);
        sc.close();
    }
}

enum Task_16_4_Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
}