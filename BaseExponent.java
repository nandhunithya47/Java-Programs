import java.util.Scanner;
public class BaseExponent {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eneter the base: ");
        int x = scanner.nextInt();
        System.out.println("enter the exponent: ");
        int y=scanner.nextInt();
        double baseExponent=Math.pow(x,y);
        System.out.println("Result: "+baseExponent);
        scanner.close();


    }
}
