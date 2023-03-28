import java.util.Locale;
import java.util.Scanner;

public class PrintAlphabetUppercase {

    // main method
    public static void main(String[] args) {
        //create obj scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Alphabet :");
        String a = scanner.nextLine();   //use scanner obj for variable a

        String out = a.toLowerCase(Locale.ROOT);  // create variable out for convert alphabet in lowercase
        System.out.println(out);

    }



}
