import java.util.Scanner;
import java.util.InputMismatchException;

public class LoopExample {
    public static void main(String[] args) {
        // Initialize variables
        String name;
        int n = 5, count;
        Scanner in = new Scanner(System.in);

        // Ask the user for a name
        System.out.print("Please enter your name: ");
        name = in.nextLine();

        // Ask the user for a n for looping
        if (name.isEmpty()) {
            System.out.println("You must enter a name.");
            System.exit(2);
        }

        // Loop to continue asking for greetings
        String answer = "yes";
        while(answer.toLowerCase().equals("yes")){
            System.out.print("How many times would you like to be greeted: ");
            try {
                n = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid number entered, defaulting to " + n);
                in.nextLine();
            }
            if (n < 1) {
                System.out.println("The number of greetings must be one or more");
                System.exit(2);
            }

            // Loop the greeting n times
            count = 1;
            while (count <= n) {
                // Print greeting
                System.out.println("Hello, " + name + "!");

                // Increment count
                count++;
            }

            System.out.print("Would you like to print the greeting more? ");
            answer = in.next();
            System.out.println();
        }

        System.out.println("Thanks for running our program");
    }
}