import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        // Create a scanner
        Scanner in = new Scanner(System.in);

        String answer = "yes";

        while (answer.equals("yes")) {
            // Ask for a value for x
            System.out.print("Please enter a number x: ");
            int x = in.nextInt();

            // Print out the value of x
            System.out.println("x = " + x);

            System.out.print("Would you like to enter another x? ");
            answer = in.nextLine();
            System.out.println();

        }
    }
}