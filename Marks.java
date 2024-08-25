import java.util.Scanner;
public class Marks {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks of subject 1: ");
        float a = scanner.nextFloat();
        System.out.println("Enter marks of subject 2: ");
        float b = scanner.nextFloat();
        System.out.println("Enter marks of subject 3: ");
        float c = scanner.nextFloat();
        System.out.println("Enter marks of subject 4: ");
        float d = scanner.nextFloat();
        System.out.println("Enter marks of subject 5: ");
        float e = scanner.nextFloat();
        float total = a+b+c+d+e;
        System.out.println("Total marks is: "+total);
        float P=(total/500)*100;
        System.out.println("Percentage is: "+P);
        float A=total/5;
        System.out.println("Average is: "+A);
        scanner.close();
    }
}

