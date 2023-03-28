import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // create scanner obj for user input

        System.out.println("Input number : ");
         int day = scanner.nextInt();    // create variable day n use obj for variable

        // if day==1 then print sunday
        if (day==1)
        {
            System.out.println("Sunday");
        }
        else if (day==2)
        {
            System.out.println("Monday");
        }
        else if (day==3)
        {
            System.out.println("Tuesday");
        }
        else if (day==4)
        {
            System.out.println("Wednesday");
        }
        else if (day==5)
        {
            System.out.println("Thursday");
        }
        else if (day==6)
        {
            System.out.println("Friday");
        }
        else if (day==7)
        {
            System.out.println("Saturday");
        }
        else
        {
            System.out.println("Invalid number");
        }

    }
    
}
