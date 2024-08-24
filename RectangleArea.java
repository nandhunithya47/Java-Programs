import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of Rectangle in cm : ");
        float length = scanner.nextFloat();
        System.out.println("Enter the breadth of Rectangle in cm : ");
        float breadth = scanner.nextFloat();
        float RectangleArea=length*breadth;
        System.out.println("Area of rectangle is: "+RectangleArea);
        
    }

}