import java.util.*;

public class Desk {
    private double maxHeight = 25;
    public double height;
    public double width;
    public double depth;
    public String color;

    public double getMaxHeight() {
        return maxHeight;
    }

    public void describe() {
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Depth: " + depth);
        System.out.println("Color: " + color);
    }
    public void move(double distance) {
        //Move
        if (distance < 0) {
            moveDown(Math.abs(distance));
        } else {
            moveUp(distance);
        }
    }

    public void moveUp(double distance) {
        System.out.println("Moving up: " + distance);
        if (height + distance > maxHeight) {
            height = maxHeight;
        } else {
            height = height + distance;
        }
    }

    public void moveDown(double distance) {
        // Move desk down
        System.out.println("Moving down: " + distance);
        if (height - distance <= 0) {
            height = 0;
        } else {
            height = height - distance;
        }
    }

//    public static void main(String[] args) {
//        System.out.print("Desk class\n\n");
//
//        Desk myDesk = new Desk();
//        myDesk.height = 1;
//        myDesk.width = 4;
//        myDesk.depth = 2;
//        myDesk.color = "Black";
//
//        Desk myOtherDesk = new Desk();
//        myOtherDesk.height = 1;
//        myOtherDesk.width = 15;
//        myOtherDesk.depth = 12;
//        myOtherDesk.color = "White";
//
//        myDesk.describe();
//        System.out.println();
//        myDesk.move(-2);
//        System.out.println();
//        myDesk.describe();
//        System.out.println();
//        myDesk.move(10);
//        System.out.println();
//        myDesk.move(20);
//        System.out.println();
//        myDesk.describe();
//    }
}