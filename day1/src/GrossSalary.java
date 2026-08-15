import java.util.Scanner;

//Write a program that calculates the gross week salary of employees
// with a rate 15 $ and can’t exceed 40 hours a week
public class GrossSalary {
    public  static void main() {
        int rate = 15;
        int maxWeeklyHours = 40;
        int weeklyHours;
        double salary;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your weekly hours: ");
        weeklyHours = input.nextInt();

        while (weeklyHours <= 0 || weeklyHours > maxWeeklyHours) {
            System.out.println("Invalid input please enter correct one:");
            weeklyHours = input.nextInt();
        }
        input.close();
        salary = weeklyHours * rate;
        System.out.println("Your gross salary is: " + salary);

    }
}
