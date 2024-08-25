import java.util.Scanner;
class DaysToYearsWeeksDays{

    public static void main(String aargs[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Days: ");
        int days=scanner.nextInt();
        int years=days/365;
        int remainingDays = days%365;
        int weeks = remainingDays/7;
        int Days=remainingDays%7;
        System.out.println("Years: "+years);
        System.out.println("Weeks: "+weeks);
        System.out.println("days: "+Days);
        scanner.close();
    }
}