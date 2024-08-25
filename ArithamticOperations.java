import java.util.Scanner;
public class ArithamticOperations {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the First Numer: ");
        float firstNumber = scanner.nextInt();
        System.out.println("Enter the Second Numer: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Select your choice: ");
        System.out.println("1.Addition");
        System.out.println("2.subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        int choice = scanner.nextInt();
        if(choice==1){
            System.out.println("Sum is: "+(firstNumber+secondNumber));
        }
        else if(choice==2){
            System.out.println("Difference is: "+(firstNumber-secondNumber));
        
        }
        else if(choice==3){
            System.out.println("product is: "+(firstNumber*secondNumber));
        }
        else if(choice==4){
            if(secondNumber!=0){
                System.out.println("division is: "+(firstNumber/secondNumber));
            }
            else{
                System.out.println("Division by zero is not possible");
            }
        }
        else{
            System.out.println("Incorrect choice!");
        }
        scanner.close();
        
    }

}
