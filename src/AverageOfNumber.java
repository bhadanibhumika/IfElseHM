import java.util.Scanner;

public class AverageOfNumber {

   // main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  //create scanner obj
        System.out.println("Input 1st number: ");
         int num1 = scanner.nextInt();    // using scanner obj for variable num1

        System.out.println("Input 2nd number: ");
         int num2 = scanner.nextInt();    // using scanner obj for variable num2

        System.out.println("Input 3rd number: ");
         int num3 = scanner.nextInt();    //using scanner obj for variable num3

        System.out.println("Input 4th number: ");
         int num4 = scanner.nextInt();    // using scanner obj variable num4

        System.out.println("Input 5th number: ");
         int num5 = scanner.nextInt();     // using scanner obj for variable num 5

        System.out.println("Total of 5 numbers is :"+(num1+num2+num3+num4+num5));
        System.out.println("Average of 5 numbers is : "+(num1+num2+num3+num4+num5)/5);



    }

}
