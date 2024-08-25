import java.util.Scanner;
class FahrenheitToCelcius {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the temperature in fahrenheit: ");
        float fahrenheit = scanner.nextFloat();
        float celcius=(fahrenheit-32)*5/9;
        System.out.println("Temperature in celcius: "+celcius);
        scanner.close();
    }

    
}