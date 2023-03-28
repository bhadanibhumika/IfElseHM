import java.util.Scanner;

public class AlphabetDigitSymbol {

    // main method

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);// scanner obj for input

        System.out.println("Enter any character :");
         char ch = scanner.next().charAt(0); // create variable ch n use scanner obj

         // if input ch is a to z or A to Z  than print this  is alphabet
        if ((ch>='a' && ch <='z')  || (ch >= 'A' && ch<='Z'))
        {
            System.out.println(ch + " is a Alphabet. ");
        }
        //if input o to 9 than print this is digit
        else if (ch>='0' && ch<='9')
        {
            System.out.println(ch + " is a Digit.");

        }
        //else input any other character  than print is a symbol
        else
        {
            System.out.println( ch + " is a symbol");
        }


    }


}
