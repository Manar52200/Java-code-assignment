package Day2;

import java.util.Scanner;

public class RectangleDaimensions {
    static Scanner scanner = new Scanner(System.in);

    static void main(String args[]){
        RectangleDaimensions rectangleDaimensions = new RectangleDaimensions();
        Rectangle kitchin = rectangleDaimensions.getDiamension();
        Rectangle bathroom = rectangleDaimensions.getDiamension();

        double totalArea = rectangleDaimensions.calculateArea(kitchin, bathroom);
        scanner.close();
    }
    public Rectangle getDiamension(){
        System.out.println("Plesae enter the length: ");
        double length = scanner.nextDouble();
        System.out.println("Plesae enter the width: ");
        double width = scanner.nextDouble();
        Rectangle room = new Rectangle (length, width);
        return room;
    }

    public double calculateArea (Rectangle r1, Rectangle r2){
        return r1.calculateArea() + r2.calculateArea();
    }
}
