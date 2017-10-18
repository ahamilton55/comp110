import java.util.*;

public class LabExamMethods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sequenceID;
        int n;

        // An infinite loop. This will run until we use the "break" keyword
        while(true) {
            // Call the askForSeq method with the argument of a Scanner named in (created above),
            // and store the returned value inside of the sequenceID variable in main.
            // Note that the sequenceID here is different from the sequenceID variable in the askForSeq method
            sequenceID = askForSeq(in);            

            System.out.println();

            if (sequenceID == 0) {
                break;
            } else if (sequenceID > 5) {
                System.out.println("Invalid sequence ID entered. Try again!");
                continue;
            }

            System.out.print("How many iterations? ");
            n = in.nextInt();

            if (n <= 0) {
                System.out.println("Iterations should be greather than 0");
                continue;
            }

            System.out.println();

            if (sequenceID == 1) {
                // Call the descreaingSeq method
                decreasingSeq(n);
            } else if (sequenceID == 2) {
                // Call the oddNumberSeq method
                oddNumberSeq(n);
            } else if (sequenceID == 3) {
                for(int i = 1; i <= n; i++) {
                    System.out.printf("%3d", 2*i);
                }
            } else if (sequenceID == 4) {
                for(int i = 0; i < n; i++) {
                    System.out.printf("%3d", (3*i)+1);
                }
            } else if (sequenceID == 5) {
                int i = 1;
                int count = 0;
                while (count < n) {
                    if ((i % 5 == 0) && !(i % 3 == 0)) {
                        System.out.printf("%3d", i);
                        count++;
                    }
                    i++;
                }
            } 
            System.out.println();
            System.out.println();
        }
        // We close the Scanner we created above. It is good practice to close Scanners and other types that do
        // I/O operations to reduce resource exhaustion on the computer
        in.close();

        System.out.println();
        System.out.println("Thanks for playing...");
    }
    // End of the main method

    // decreasingSeq will print out a sequence of numbers starting and n and ending at 1
    // The return type is void so no return is provided
    // The arguments are an integer named n
    public static void decreasingSeq(int n) {
        for(int i = n; i > 0; i--) {
            System.out.printf("%3d", i);
        }
    }
    // end of the decreasingSeq method

    // oddNumberSeq will print out a sequence of odd numbers between 1 and n
    // The return type is void so no return is provided
    // The arguments are an integer named n
    public static void oddNumberSeq(int n) {
        for(int i = 0; i < n; i++) {
            System.out.printf("%3d", (2*i)+1);
        }
    }
    // end of the oddNumberSeq method
    
    // askForSeq will ask the user for which sequence to run and return that to the caller
    // The return type is an int
    // The method arguments are a Scanner named input
    public static int askForSeq(Scanner input) {
        // Notice that sequenceID here is different from the sequenceID in the main method above.
        // Variables are "scoped" to the method they are created in meaning they cannot be accessed outside of the method.
        // We use method arguments to pass around values in variables between different methods
        int sequenceID;

        System.out.println("Available Numeric Sequences");
        System.out.println("=================");
        System.out.println("  1. Descending sequence");
        System.out.println("  2. Odd Numbers");
        System.out.println("  3. Even Numbers");
        System.out.println("  4. Every third number");
        System.out.println("  5. Numbers divisible by 5 but not 3");
        System.out.println();

        System.out.print("What numeric sequence would you like to print (use integer to select, 0 to quit)? ");
        sequenceID = input.nextInt();

        return sequenceID;
    }
    // end of the askForSeq method
}