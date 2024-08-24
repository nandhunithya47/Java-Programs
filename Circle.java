import java.util.Scanner;
public class Circle {
    public static void main(String aargs[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        float radius = scanner.nextInt();
        float Diameter = 2*radius;
        System.out.println("Diameter of circle: "+Diameter);
        float Circumference = (float) (Math.PI *2 *radius);
        System.out.println("Circumference of the circle: "+Circumference);
        float Area = (float) (Math.PI *radius*radius);
        System.out.println("Area of circle is: "+Area);
        scanner.close();


    }

}
