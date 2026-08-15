import java.util.Scanner;
//Write a program to calculate the average score for 3 students in 4 tests
public class Average {
    public static void main(String[] args) {
        int numberOfStudents = 3;
        int numberOfTests = 4;
        int score;
        int total = 0;
        int average;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < numberOfTests; j++) {
                System.out.println("Plesae enter the score of the " +
                        (j+1) + " test for " + (i+1) + " student");
                score = scanner.nextInt();
                total += score;
            }
            average = total / numberOfTests;
            System.out.println("The average score for the " +
                    (i+1) + " student is " + average);
            total = 0;
        }
        scanner.close();
    }
}
