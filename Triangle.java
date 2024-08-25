import java.util.Scanner;
class Triangle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter angle1: ");
        float a = scanner.nextFloat();
        System.out.println("enter angle2: ");
        float b = scanner.nextFloat();
        float c= 180-(a+b);
        System.out.println("3rd angle is "+c);
        scanner.close();
    }
}
