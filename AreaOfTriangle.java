import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Base: ");
        float a = scanner.nextFloat();
        System.out.println("Enter Height: ");
        float b = scanner.nextFloat();
        double c = 0.5*a*b;
        System.out.println("Area of triangle is: "+c);
        scanner.close();
    }
}

