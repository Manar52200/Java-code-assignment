package Day2;
import java.util.Scanner;

public class InstaPayCheck {
    static double requiredSalary = 25.00;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double salary = getSalary();
        int creditScore = getCreditScore();
        boolean check = isEligible(salary, creditScore);
        message(check);
        scanner.close();
    }

    public static double getSalary(){
        System.out.println("Please enter your salary: ");
        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getCreditScore(){
        System.out.println("Please enter your credit score: ");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isEligible (double salary, int creditScore) {
        if (salary >= requiredSalary && creditScore >= requiredCreditScore) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void message (boolean check) {
        if (check  == true) {
            System.out.println("Congratulations, You can get loan");
        }
        else {
            System.out.println("Sorry, you can't get loan");
        }
    }

}
