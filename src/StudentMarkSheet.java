import java.util.Scanner;

public class StudentMarkSheet {
    public static void main(String[] args) {
        String name;   // create variable
        int roll,math,eng,sci;

        Scanner scanner =new Scanner(System.in);// create scanner obj

        System.out.println("Please enter Name: ");
        name = scanner.nextLine();// using scanner obj

        System.out.println("Enter roll number:");
        roll = scanner.nextInt(); //use scanner object for roll num

        System.out.println("Enter marks in maths,eng,and sci");
        math = scanner.nextInt();// use scanner object for subject
        eng = scanner.nextInt();
        sci = scanner.nextInt();

      //  int total = math+eng+sci;// create variable total
       // System.out.println("Total Marks :"+(math+eng+sci)); // for total marks

        System.out.println("name: "+name);// for print name
        System.out.println("Roll number : "+roll); // for print roll number
        System.out.println("mark of subjects math,eng,sci ="+math+" "+eng+" "+sci);

         int total = math+eng+sci;// create variable total
         System.out.println("Total Marks :"+(math+eng+sci)); // for total marks

     //   float perc =(total/3);
      //  System.out.println("percentage: "+perc);

        //if maths english and sci marks more than 35
        if(math>=35 && eng>=35 && sci>=35)
        {
            System.out.println("you are pass");

        }
        else
        {
            System.out.println("you are fail");
        }


    }
}
