import java.util.Scanner;

public class SellersDetail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  //create scanner obj

        System.out.println("Enter sales id :");
        String salesid = scanner.nextLine();   // using obj scanner for salesid variable

        System.out.println("Enter name:");
        String name = scanner.nextLine();   // using obj scanner for name variable

        System.out.println("Enter the basic salary");
        double basicsalry = scanner.nextDouble();  //using scanner obj for basicsalry variable

        System.out.println("Enter amount :");
        double amount = scanner.nextDouble();  //using obj scanner for amount variable

        //if sales amount is more than 50000
       if(amount>=50000)
       {
           System.out.println("your commission is 35%");
       }
       //if amount is more than 30000
       else if (amount>=30000)
       {
           System.out.println("Your commission is 20%");
       }
       //if amount is more than 200000
       else if (amount>=20000)
       {
           System.out.println("Your commission is 10%");
       }
       //if amount is more than 10000
       else if (amount>=10000)
       {
           System.out.println("Your commission is 5%");

       }
       //if amount is less than 10000
       else if (amount<10000) {
           System.out.println("Your commission is 2%");
       }
       else
       {
           System.out.println("your commission is 0");
       }


    }
    }


