import java.util.*;
public class Die {
    private int sides;
    private Random rand;

    // Default constructor will create the random number generator and
    // default the number of sides to 10.
    public Die() {
        rand = new Random();
        sides = 10;
    }

    // Constructor that will take the number of sides from the user
    public Die(int n) {
        rand = new Random();
        sides = n;
    }

    // A "getter" to return the number of sides. The "sides" variable is private
    // so a "getter" is required to get the value.
    public int getSides() {
        return sides;
    }

    // A "setter" to update the number of sides for a given die. The user can use
    // this method to access the private variable "sides" after creation
    public void setSides(int n) {
        sides = n;
    }

    // Roll the die and return the number. This will get an integer between 0 and sides-1,
    // add 1 to the value and then return to the user
    public int roll() {
        return rand.nextInt(sides) + 1;
    }
}