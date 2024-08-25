import java.util.Scanner;
public class CentimeterConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length in CM: ");
        float length = scanner.nextFloat();
        float Meters = length/100;
        System.out.println("Length in meter is: "+Meters);
        float Km= length/100000;
        System.out.println("Length in Kilometers: "+Km);
        scanner.close();
        
    }

}
