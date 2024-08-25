import java.util.Scanner;
public class RectanglePerimeter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of Rectangle in cm : ");
        float length = scanner.nextFloat();
        System.out.println("Enter the breadth of Rectangle in cm : ");
        float breadth = scanner.nextFloat();
        float RectanglePerimeter=2*(length+breadth);
        System.out.println("Perimeter of rectangle is: "+RectanglePerimeter);
        scanner.close();
    }

}
