import java.util.Scanner;

public class CalculationInIFElse {


    //main method
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);     //create scanner obj
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();    //using scanner obj for num1 variable

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();     // using scanner obj for  num2 variable

        System.out.println("Enter the operator you want(+,-,*,/): ");
        char symbol;       //create variable
        symbol = scanner.next().charAt(0);

        //if symbol is + than addition of number
        if (symbol == '+')
        {
            System.out.println("Addition of = " + num1 + "+" + num2 + "=" + (num1 + num2));
        }
        else if (symbol == '-') {
            System.out.println("Substraction of = " + num1 + "-" + num2 + "=" + (num1 - num2));
        }
        else if (symbol=='*')
        {
            System.out.println("Multiplication of = " + num1 + "*" + num2 + "=" + (num1 * num2));
        }
        else if (symbol=='/')
        {
            System.out.println("Division of = " + num1 + "/" + num2 + "=" + (num1 / num2));
        }
        else
        {
            System.out.println("Operator is not available");
        }

    }
}