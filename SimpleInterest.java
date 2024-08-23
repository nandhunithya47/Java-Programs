import java.util.Scanner;  //java.util-package, scanner- class from java util package that takes input from user

public class SimpleInterest{
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in); // to create instance of class scanner, system.in -read standard input stream.

        System.out.println("Enter the Principle(p): "); // prompting user to enter principle amount.

        double principle = scanner.nextDouble(); //reads float value and stores in variable principle, nextDouble-method used to read input

        System.out.println("Enter the Time Period(T): ");

        int Time = scanner.nextInt();

        System.out.println("Enter the RateOfInterest(R): ");

        int R = scanner.nextInt();

        double simpleinterst= (principle*Time*R)/100; //used to calculate simple interest usimng formula

        System.out.println(simpleinterst);

        scanner.close(); // closing the object scanner



    }

}
