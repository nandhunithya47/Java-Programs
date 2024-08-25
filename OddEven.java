import java.util.Scanner;
public class OddEven {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        float a = scanner.nextFloat();
        if(a%2==0){
           System.out.println("The number is even");
        }
        else{
           System.out.println("Number is odd");
        }
        scanner.close();
    }
}