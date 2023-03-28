import java.util.Scanner;

public class PrintCityName {

    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner obj

        System.out.println(" Enter Alphabet : ");
        String alphabet = scanner.nextLine();  // create variable n use scanner obj for variable

         // if input alphabet a or A than print city name Ahmedabad
        if(alphabet.equalsIgnoreCase("a"))
        {
            System.out.println(" Ahmedabad ");
        }
        // if input alphabet b  than print banglore
        else if (alphabet.equalsIgnoreCase("b"))
        {
            System.out.println(" Banglore ");
        }
        // if input alphabet c  than print chennai
        else if (alphabet.equalsIgnoreCase("c"))
        {
            System.out.println(" Chennai ");
        }
        // if input alphabet d  than print Delhi
        else if (alphabet.equalsIgnoreCase("d"))
        {
            System.out.println(" Delhi ");
        }
        // if input alphabet e  than print Egypt
        else if (alphabet.equalsIgnoreCase("e"))
        {
            System.out.println(" Egypt ");
        }
        // if input alphabet f  than print france
        else if (alphabet.equalsIgnoreCase("f"))
        {
            System.out.println(" France ");
        }
        else
        {
            System.out.println(" Invalid alphabet ");
        }
    }
}
