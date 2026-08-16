package day1;

import java.util.Scanner;
//Write a program that allow user to add to numbers and keep repeating as he wants
public class AddNumber {
    public static void main () {
        int q;
        int num;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of numbers you want to add: ");
        q = scanner.nextInt();

        while (q <= 0){
            System.out.println("Invalid input, plesae provide correct one: ");
            q = scanner.nextInt();
        }

        for (int i = 0; i < q; i++) {
            System.out.println("Plesae enter " + (i+1) +" Number");
            num = scanner.nextInt();
            sum += num;
        }
        System.out.println("Sum is " + sum);
        scanner.close();
    }
}
