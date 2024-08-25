import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        float n = scanner.nextFloat();
        float fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("factorial of the number is: " +fact);
        scanner.close();
    }
}
