//Explain break by writing a program to check for letter A

import java.util.Scanner;

public class FindACharacter {
    public static void main(String[] args) {
        String text;
        char ch = 'A';

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a text: ");
        text = scanner.nextLine();

        text = text.toUpperCase();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch){
                System.out.println(i);
                break;
            }
        }
        System.out.println("Character is not found");
    }
}
