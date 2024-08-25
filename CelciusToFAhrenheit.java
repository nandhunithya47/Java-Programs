import java.util.Scanner;
public class CelciusToFAhrenheit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Temperature in Celcius: ");
        float celcius = scanner.nextFloat();
        float fahrenheit = (celcius*9/5)+32;
        System.out.println("Temperature in fahrenheit "+fahrenheit);
        scanner.close();
         
    }

}
