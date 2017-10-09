import java.util.Scanner;
import java.util.InputMismatchException;

public class Lab3 {
    public static void main(String[] args) {
        // Declare my variables
        double c0, c1, c2, c3, c4, c5, x, value;
        c0 = 0;
        c1 = 0;
        c2 = 0;
        c3 = 0;
        c4 = 0;
        c5 = 0;
        value = 0;
        String answer;
        Scanner in = new Scanner(System.in);

        do {
            // Ask for coefficients
            try {
                System.out.print("Enter coefficient 5:  ");
                c5 = in.nextDouble();
                System.out.print("Enter coefficient 4:  ");
                c4 = in.nextDouble();
                System.out.print("Enter coefficient 3:  ");
                c3 = in.nextDouble();
                System.out.print("Enter coefficient 2:  ");
                c2 = in.nextDouble();
                System.out.print("Enter coefficient 1:  ");
                c1 = in.nextDouble();
                System.out.print("Enter coefficient 0:  ");
                c0 = in.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("You must enter valid doubles");
                System.out.println();
                in.next();

                System.out.print("Try again? ");
                answer = in.next();
                continue;
            }

            do {
                // Ask for a value for x
                System.out.print("Enter x:  ");
                x = in.nextDouble();

                // Compute the value using the coefficients and x
                value = (c5 * Math.pow(x, 5)) + (c4 * Math.pow(x, 4)) + (c3 * Math.pow(x, 3)) + (c2 * Math.pow(x, 2)) + (c1 * Math.pow(x, 1)) + c0;

                // Print out the computed value
                System.out.println("Value: " + value);

                // Ask to see if they'd like to continue
                System.out.print("Another x? ");
                answer = in.next();

                System.out.println();
            } while(answer.toLowerCase().equals("yes"));

            System.out.print("Another polynomial? ");
            answer = in.next();
        } while(answer.toLowerCase().equals("yes"));

        // Program cleanup
        System.out.println();
        System.out.println("End of program.");
    }
}