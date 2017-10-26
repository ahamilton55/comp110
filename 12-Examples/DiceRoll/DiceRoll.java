// For Random()
import java.util.*;

public class DiceRoll {
    // These are variables that are accessible to any of the methods below
    public static int numOfDice = 2;
    public static int numOfSides = 6;
    public static Random rand;

    // This function will automatically run and with setup our "rand" variable
    // with a new random number generator
    static {
        rand = new Random();
    }

    public static void main(String[] args) {
        // Iterate 100 times to print out the results of a roll to check it
        // Remember: i < 100 is equivalent to i <= 99, so we will iterate from 0 to 99
        for (int i = 0; i < 100; i++) {
            // Roll the dice and store the value in a local variable named num
            int num = rollv2();

            // We set checks here to make sure that we are getting the correct values for our current setup
            if (num >= 2 && num <= 12) {
                System.out.println(num);
            } else {
                System.out.println("Error: " + num);
            }
        }

    }

    // This is a basic roll method and will produce random numbers between 
    // numOfDice and (numOfDice * numOfSides)
    public static int roll() {
        // rand.nextInt(bound) will produce a result between 0 and bound -1
        // Here we are setting it to our bound mentioned above, but also subtracting
        // an additional amount to help us more easily correct to the range we want. 
        int roll = rand.nextInt((numOfDice * numOfSides)-(numOfDice - 1));

        // Adds the numOfDice value to make sure that we are in the correct range of values
        // and then return that combined value
        return roll + numOfDice;
    }

    // This version will do separate roles of dice that is more inline with what we want
    // We will randomly generate a number between 0 and numOfSides (exclusive) and then add
    // 1 to get the range of 1 and numOfSides (inclusive);
    //
    // We then keep a running sum of the values using our "roll" variable that will last longer
    // than the loop and and allow us to return the correct value to the user
    public static int rollv2() {
        // This is not  needed but is here to help us debug if needed
        int[] nums = new int[numOfDice];
        // An accumulator value
        int roll = 0;

        // Our loop will start at 0 and will run until i is equal to numOfDice
        for(int i = 0; i < numOfDice; i++) {
            // Generate a random numbr between 0 and numOfSides (exclusive), add one to that value
            // and finally assign it to a holder value
            nums[i] = (rand.nextInt(numOfSides) + 1);

            // Add the holder value to our accumulator
            roll += nums[i];
        }

        // Debugging print statement that isn't totally required but allows us to make sure the method
        // is working how we expect it to be
        System.out.printf("%d + %d = ", nums[0], nums[1]);

        // Return the value in our accumulator variable to the user
        return roll;
    }
}
