package ex_11jan_exam;

public class DayOfTheWeek {
    //6) Day of the Week

    //Description:
   // Write a Java program to print the name of the day based on a number (1–7) using a switch statement.
    public static void main(String[] args) {
        int weekno=5;
        switch(weekno)
        {
            case 1:System.out.println("Sunday");break;
            case 2:System.out.println("Monday");break;
            case 3:System.out.println("Tuesday");break;
            case 4:System.out.println("Wednesday");break;
            case 5:System.out.println("Thursday");break;
            case 6:System.out.println("Friday");break;
            case 7:System.out.println("Saturday");break;
            default:System.out.println("invalid day");break;

        }
    }

}
