import java.util.Scanner;
class Summation{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter Second Number: ");
        int secondNumber = scanner.nextInt();
        int Summation = firstNumber+secondNumber;
        System.out.println("sum of two numbers is: "+Summation);
        scanner.close();
    }
}