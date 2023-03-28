import java.util.Scanner;

public class OddEvenNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // create scanner obj for input

        System.out.println("Enter a Number: ");
        int num = scanner.nextInt(); // create variable n use object

        //if num divided 2 = 0 this is even number
        if(num%2==0)
        {
            System.out.println(num + " is a Even number");
        }
        else
        {
            System.out.println( num + " is a Odd number ");
        }

    }
}
