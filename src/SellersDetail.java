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

        System.out.println("sales id: "+salesid);// print for salesid
        System.out.println("saler's name: "+name);// print for name
        System.out.println("basic salary:"+basicsalry);// print for basicsalary
        System.out.println("amount: "+amount);// print for amount

        //if sales amount is more than 50000
       if(amount>=50000)
       {
           System.out.println("your commission is  35% = " +  (amount*35/100));
       }
       //if amount is more than 30000
       else if (amount>=30000)
       {
           System.out.println("Your commission is 20% = "+ (amount*20/100));
       }
       //if amount is more than 200000
       else if (amount>=20000)
       {
           System.out.println("Your commission is  10% = "+(amount*10/100));
       }
       //if amount is more than 10000
       else if (amount>=10000)
       {
           System.out.println("Your commission is = "+ (amount*5/100));

       }
       //if amount is less than 10000
       else if (amount<10000) {
           System.out.println("Your commission is = "+ (amount*2/100));
       }
       else
       {
           System.out.println("your commission is 0");
       }


    }
    }


