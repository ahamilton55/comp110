// Import the classes inside of the java.util.* package
import java.util.*;

public class TestInput {
    public static void main(String[] args) {
        // A Scanner is used to get input from the user
        // You create a new instantiaation of the Scanner class using the "new" keyword
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a side length: ");

        // This is a variable
        // A variable starts with the type of the variable, then the name, then finally the value the variable will get.
        String length = sc.next();
        //int area = length*length;

        // This is string concatenation where we are able to add variables to strings
        System.out.println("Area of a square with length " + length);
    }
}