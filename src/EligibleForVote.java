import java.util.Scanner;

public class EligibleForVote {

    Scanner scanner = new Scanner(System.in);

    public void vote() {
        System.out.println("Please enter you age in inter value..");
        //storing age in variable using scanner object
        int age = scanner.nextInt();

        // if age is more than 18 or 18 that age is eligible
        if (age >= 18) {
            System.out.println(" you are Eligible for vote as your age is :" + age);
        } else {
            System.out.println(" you are Eligible for vote as your age is :" + age);
        }
    }
      //main method
      public static void main(String[] args) {
        // creating class object to call non static method in static area
        EligibleForVote eligibleForVote = new EligibleForVote();
        //calling method using class object
        eligibleForVote.vote();




    }
}