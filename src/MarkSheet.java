import java.util.Scanner;

public class MarkSheet {
    // create score method
    public  void score() {
        Scanner scanner = new Scanner(System.in);// creating scanner obj for user

        System.out.println("please enter your Name: ");
        String name = scanner.nextLine();//use scanner obj for name

        System.out.println("please type your roll number: ");
        int roll = scanner.nextInt();//use scanner obj for roll number

        System.out.println("please enter english marks: ");
        int english = scanner.nextInt();// use scanner obj for english marks

        System.out.println("please enter maths marks:  ");
        int maths = scanner.nextInt();// use scanner obj for maths marks

        System.out.println("please enter science marks: ");
        int science = scanner.nextInt();// use scanner obj for science marks

         int total = (english+maths+science);// create variable t0tal for total marks
        System.out.println("Total marks: "+total);

        float percentage = (total/3);//create variable per for per
        System.out.println("percentage: "+percentage);

        //if percentage is greater than 35 than you are pass
        if(percentage>=35)
        {
            System.out.println("you are pass");
        }
        // if percentage is grater than 80 than your grade is A+
        if(percentage>=80)   //condition for percentage
        {
            System.out.println("your grade is A+");
        }
        //if percentage is grater than 60
        else if(percentage>=60)
        {
            System.out.println("your grade is A");
        }
        //if percentage is grater than 50
        else if (percentage>=50)
        {
            System.out.println("your grade is b");
        }
        //if percentage is grater then 35
        else if (percentage>=35)
        {
            System.out.println("your grade is c");
        }
        else
        {
            System.out.println("you are fail");
        }


    }

    public static void main(String[] args) {
        MarkSheet markSheet = new MarkSheet(); // creat obj for static method
        markSheet.score();// calling score method in main method

    }

    }




