package day1;

import java.util.Scanner;
//Write a program that allow a cashier to scan a given number of items and get the cost
public class CostOfItems {
    static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.print("Please enter the quantity: ");
        int quantity, price , total = 0;
        quantity = scanner.nextInt();

        for (int i = 0; i < quantity; i++){
            System.out.println("plesae enter prince of item " + (i+1));
            price = scanner.nextInt();
            total += price;
        }
        scanner.close();
        System.out.println("Total price is " + total);
    }
}
