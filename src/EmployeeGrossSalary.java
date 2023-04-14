import java.util.Scanner;

public class EmployeeGrossSalary {

// creating variable
    static String employeid;
    static String emname;
    static int basicsalary, Grosssalary, HRA,DA,TA,PF;

    //main method
    public static void main(String[] args) {
        EmployeeGrossSalary employeeGrossSalary = new EmployeeGrossSalary(); // create obj for non static method
       employeeGrossSalary.read(); //calling in main method
       employeeGrossSalary.calculate(); // calling in main method
    }
    //read method
    public  void read()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the employee id:");//input for user
        employeid = scanner.nextLine();      //using scanner obj for variable employee id

        System.out.println("Enter the employee name :");
        emname = scanner.nextLine();       // using scanner obj for variable em name

        System.out.println("Enter the Basic salary :");
        basicsalary=scanner.nextInt();  //using scanner obj for variable basic salary

        System.out.println("employee id: "+employeid);//print for id
        System.out.println("employee Name: "+emname); //print for name
        System.out.println("employee basic salary: "+basicsalary);// print for basic salary

        //calculate method
    }
    // main method
    public   void calculate(){
        HRA=(basicsalary*10)/100; //HRA=10%
        DA=(basicsalary*8)/100; //DA =8%
        TA=(basicsalary*9)/100; //TA = 9%
        PF=(basicsalary*20)/100; //PF = 20%
        Grosssalary=(basicsalary+HRA+DA+TA-PF);
        System.out.println("Gross salary =" + Grosssalary);
    }
}
