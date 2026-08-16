package Day2;
import java.util.Scanner;

public class RectangleMain {
    static void main(String[] args) {
        Rectangle room1 = new Rectangle();
        room1.setLength(10);
        room1.setWidth(20);

        double room1Area = room1.calculateArea();

        Rectangle room2 = new Rectangle (20, 30);
        double room2Area = room2.calculateArea();

        double totalAreas = room1Area + room2Area;
        System.out.println("The total area of the rectangle is: " + totalAreas);
    }

}
