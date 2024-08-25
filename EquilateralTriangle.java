import java.util.Scanner;
public class EquilateralTriangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of a side: ");
        float a = scanner.nextFloat();
        double c = (Math.sqrt(3)/4)*(a*a);
        System.out.println("3rd Angle is: "+c);
        scanner.close();
    }
}

