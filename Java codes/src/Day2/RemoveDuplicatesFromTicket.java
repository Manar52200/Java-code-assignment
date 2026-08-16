package Day2;
import java.util.Arrays;
import java.util.Random;

public class RemoveDuplicatesFromTicket {
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_LENGTH = 69;
    public static void main(String[] args) {
        int []ticket = generateTicketNumber();

    }
    public static int[] generateTicketNumber() {
        int[] ticket = new int [LENGTH];
        Random random = new Random();

        for (int i = 0; i < LENGTH; i++) {
            int number;
            do {
                number = random.nextInt(MAX_TICKET_LENGTH)+1;
            }while (search(ticket, number));
            ticket[i] = number;
        }
        return ticket;
    }

    public static boolean search(int[]ticket, int numberToSearchFor) {
        for (int value: ticket) {
            if (value == numberToSearchFor) {
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearch(int[]ticket, int numberToSearchFor) {
        Arrays.sort(ticket);
        int  index = Arrays.binarySearch(ticket, numberToSearchFor);
        if (index >= 0) {
            return true;
        }
        else {
            return false;
        }
    }

}
