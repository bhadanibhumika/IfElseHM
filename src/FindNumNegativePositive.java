import java.util.Scanner;

public class FindNumNegativePositive {

    //main method
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);//  create  object for the scanner class

        System.out.println("Enter a Number: ");
        num = scanner.nextInt();//use obj scanner for num variable


        //if number is greater than 0
        if(num>0)
        {
            System.out.println("The number is positive.");
        }
        // if number is less than 0
        else if (num<0)
        {
            System.out.println("The number is negative.");
        }
        else
        {
            System.out.println("The number is Zero.");
        }


    }
}
