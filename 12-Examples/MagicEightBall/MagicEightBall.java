// For Random() and Scanner()
import java.util.*;

public class MagicEightBall {
    // Our main method that will automatically be executed by the JVM
    public static void main(String[] args) {
        // Create a scanner to wait for user input
        Scanner in = new Scanner(System.in);

        // Ask the user for their question
        System.out.print("What is your question? ");
        in.nextLine();

        try {
            // Call the shake function to cause some delay
            shake();
            
        } catch (InterruptedException e) {
            // The Thread.sleep() functions below can cause an exception but we don't have an action to take if it does
            System.out.println();
        }

        // Get a random number from our getRand() function and store it in the variable randomNum
        int randomNum = getRand();
        System.out.print("Your fortune is: ");
        // Take our random number and print out a random fortune
        printFortuneV2(randomNum);

        // Close the scanner
        in.close();
    }

    // The shake method is a simple method to make it look like we're doing more work than we actually are
    // This method will give the illusion to our user that we are shaking the magic eight ball before giving
    // out the fortune
    public static void shake() throws InterruptedException {
        System.out.println();
        System.out.print("Shaking ");
        // Thread.sleep will sleep (or pause the run) for 800 milliseconds or 0.8 seconds 
        Thread.sleep(800);
        System.out.print(". ");
        Thread.sleep(800);
        System.out.print(". ");
        Thread.sleep(800);
        System.out.print(". ");
        System.out.println();
        System.out.println();

    }

    // getRand will generate a random number between 0 and 19, this is a range of 20 numbers as used below
    public static int getRand() {
        // Create a new random number generator
        Random rand = new Random();
        // We call the rand.nextInt with a maximum of 20 to generate a number between 0 and 19 and automatically
        // return that number to the caller
        return rand.nextInt(20);
    }

    // printFortune will print out the fortune for the provided number (num) using a set of dependent if statements
    public static void printFortune(int num) {
        if (num == 0) {
            System.out.println("It is certain");
        } else if (num == 1) {
            System.out.println("Don't count on it");
        } else if (num == 2) {
            System.out.println("My reply is no");
        } else if (num == 3) {
            System.out.println("Better not tell you now");
        } else if (num == 4) {
            System.out.println("Cannot predict now");
        } else if (num == 5) {
            System.out.println("Concentrate and ask again");
        } else if (num == 6) {
            System.out.println("Reply hazy try again");
        } else if (num == 7) {
            System.out.println("Yes");
        } else if (num == 8) {
            System.out.println("Signs point to yes");
        } else if (num == 9) {
            System.out.println("Outlook good");
        } else if (num == 10) {
            System.out.println("Most likely");
        } else if (num == 11) {
            System.out.println("As I see it, yes");
        } else if (num == 12) {
            System.out.println("You may rely on it");
        } else if (num == 13) {
            System.out.println("Yes definitely");
        } else if (num == 14) {
            System.out.println("Without a doubt");
        } else if (num == 15) {
            System.out.println("It is decidedly so");
        } else if (num == 16) {
            System.out.println("Ask again later");
        } else if (num == 17) {
            System.out.println("My sources say no");
        } else if (num == 18) {
            System.out.println("Outlook not so good");
        } else if (num == 19) {
            System.out.println("Very doubtful");
        }
    }

    // printFortuneV2 is a second version to print fotunes using an array. We take the number from the user and
    // print out the fortune using an index in the array "fortunes"
    public static void printFortuneV2(int num) {
        // An array for our fotunes so we can easily address them using 0-based lookups which is the numbers we
        // get when using the random number generator above
        String[] fortunes = {
            "It is certain",             // index: 0
            "It is decidedly so",        // index: 1
            "Without a doubt",
            "Yes definitely",
            "You may rely on it",        // index: 4
            "As I see it, yes",
            "Most likely",
            "Outlook good",              // index: 7
            "Yes",
            "Signs point to yes",
            "Reply hazy try again",      // index: 10
            "Ask again later",
            "Better not tell you now",   // index: 12
            "Cannot predict now",
            "Concentrate and ask again", // index: 14
            "Don't count on it",
            "My reply is no",
            "My sources say no",         // index: 17
            "Outlook not so good",
            "Very doubtful",             // index: 19
        }; // 20 total fortunes, 0 to 19

        // Print out the fortune from the array above using the number provided by the user
        System.out.println(fortunes[num]);
    }
}