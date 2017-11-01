import java.util.*;

public class Furniture {
    public static void main(String[] args) {
        System.out.print("Furniture class\n\n");

        Desk myDesk = new Desk();
        myDesk.height = 1;
        myDesk.width = 4;
        myDesk.depth = 2;
        myDesk.color = "Black";

        Desk myOtherDesk = new Desk();
        myOtherDesk.height = 1;
        myOtherDesk.width = 15;
        myOtherDesk.depth = 12;
        myOtherDesk.color = "White";

        myDesk.describe();
        System.out.println();
        myDesk.move(-2);
        System.out.println();
        myDesk.describe();
        System.out.println();
        myDesk.move(10);
        System.out.println();
        myDesk.move(20);
        System.out.println();
        myDesk.describe();

        System.out.println("Max height: " + myDesk.getMaxHeight());
    }
}