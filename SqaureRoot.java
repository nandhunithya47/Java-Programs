import java.util.Scanner;
public class SqaureRoot {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        float a = scanner.nextFloat();
        double b= Math.sqrt(a);
        System.out.println("Squareroot of " +a+ " is " +b);
        scanner.close();
        
    }
}
