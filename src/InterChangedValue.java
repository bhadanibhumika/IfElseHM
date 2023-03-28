import java.util.Scanner;

public class InterChangedValue {

    public static void main(String[] args) {
        int x,y,z; // declare variable

        Scanner scanner = new Scanner(System.in); // create scanner obj

        System.out.println("Enter value of X and Y : ");
        x = scanner.nextInt(); // using scanner obj for variable

        y = scanner.nextInt();
        System.out.println("Before changing number :"+x+" "+y);

        z=x;
        x=y;
        y=z;
        System.out.println("After changing number :"+ x +" " +y);



    }
}
