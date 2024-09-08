import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Principle: ");
        float P = scanner.nextFloat();
        System.out.println("Rate: ");
        float r = scanner.nextFloat();
        System.out.println("time: ");
        float t = scanner.nextFloat();
        System.out.println("enter number of times interest is compounded per year: ");
        int n =scanner.nextInt();
        double d = P*Math.pow(1+(r/(n*100)),(n*t));
        
        System.out.println("compound Interest is: "+d);
        scanner.close();
    }
}

